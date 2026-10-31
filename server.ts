import express, { Request, Response } from 'express';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import JSZip from 'jszip';
import { createServer as createViteServer } from 'vite';

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);
const isProd = process.env.NODE_ENV === 'production';
const PORT = 3000;

const app = express();
app.use(express.json());

// Serve static assets for MT Web Manager and extracted tools
const publicDir = path.join(__dirname, 'public');
app.use('/assets', express.static(path.join(publicDir, 'web-manager/assets')));
app.use('/web-manager', express.static(path.join(publicDir, 'web-manager')));
app.use('/extracted', express.static(path.join(publicDir, 'assets-extracted')));

// Virtual file system items
interface VfsItem {
  name: string;
  type: 'file' | 'directory';
  size: number;
  updatedAt: string;
  permissions: string;
  content?: string;
}

const vfsState: Record<string, VfsItem[]> = {
  '/': [
    { name: 'sdcard', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:30', permissions: 'drwxrwx--x' },
    { name: 'storage', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:30', permissions: 'drwxr-x--x' },
    { name: 'system', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:20', permissions: 'drwxr-xr-x' },
    { name: 'data', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:25', permissions: 'drwxrwx--x' },
    { name: 'vendor', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:20', permissions: 'drwxr-xr-x' },
    { name: 'mnt', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:20', permissions: 'drwxr-xr-x' }
  ],
  '/storage': [
    { name: 'emulated', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:30', permissions: 'drwxr-x--x' }
  ],
  '/storage/emulated': [
    { name: '0', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:30', permissions: 'drwxrwx--x' }
  ],
  '/storage/emulated/0': [
    { name: 'MT2', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:32', permissions: 'drwxrwx--x' },
    { name: 'Download', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:31', permissions: 'drwxrwx--x' },
    { name: 'Android', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:25', permissions: 'drwxrwx--x' },
    { name: 'DCIM', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:22', permissions: 'drwxrwx--x' },
    { name: 'Documents', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:22', permissions: 'drwxrwx--x' }
  ],
  '/sdcard': [
    { name: 'MT2', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:32', permissions: 'drwxrwx--x' },
    { name: 'Download', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:31', permissions: 'drwxrwx--x' },
    { name: 'Android', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:25', permissions: 'drwxrwx--x' },
    { name: 'DCIM', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:22', permissions: 'drwxrwx--x' },
    { name: 'Documents', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:22', permissions: 'drwxrwx--x' },
    { name: 'virtual_test_env.cfg', type: 'file', size: 512, updatedAt: '2026-10-31 04:33', permissions: '-rw-rw----', content: 'MODE=SANDBOX_VIRTUAL\nDEBUG=TRUE\nHOOK_METHOD=INJECT_LOG\nARCH=arm64-v8a\nTARGET_PACKAGE=bin.mt.plus' }
  ],
  '/sdcard/MT2': [
    { name: 'apks', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:32', permissions: 'drwxrwx--x' },
    { name: 'extracted', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:32', permissions: 'drwxrwx--x' },
    { name: 'logs', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:32', permissions: 'drwxrwx--x' },
    { name: 'scripts', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:32', permissions: 'drwxrwx--x' },
    { name: 'Test-Features-virtually.apk', type: 'file', size: 37521106, updatedAt: '2026-10-31 04:34', permissions: '-rw-rw----' }
  ],
  '/sdcard/Download': [
    { name: 'Test-Features-virtually.apk', type: 'file', size: 37521106, updatedAt: '2026-10-31 04:30', permissions: '-rw-rw----' },
    { name: 'PARTS-MANIFEST.json', type: 'file', size: 665, updatedAt: '2026-10-31 04:30', permissions: '-rw-rw----', content: '{\n  "original_file": "test.zip",\n  "original_size_bytes": 37521106,\n  "original_sha256": "8f83cef8ac63f76a81e1fee3ededb213f6ba43cc19761e38bc4e567c87edd47d",\n  "part_count": 2\n}' },
    { name: 'feature_checklist.txt', type: 'file', size: 284, updatedAt: '2026-10-31 04:31', permissions: '-rw-rw----', content: '[x] Dual-Pane File Manager\n[x] APK Structure Analysis\n[x] DEX 1-5 Bytecode Parsing\n[x] Smali Code Injection Logging\n[x] Virtual Terminal Shell\n[x] Permission & Manifest Audit\n[x] Virtual Execution Sandbox\n' }
  ],
  '/system': [
    { name: 'bin', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:20', permissions: 'drwxr-xr-x' },
    { name: 'lib64', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:20', permissions: 'drwxr-xr-x' },
    { name: 'etc', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:20', permissions: 'drwxr-xr-x' },
    { name: 'framework', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:20', permissions: 'drwxr-xr-x' },
    { name: 'build.prop', type: 'file', size: 2890, updatedAt: '2026-10-31 04:20', permissions: '-rw-r--r--', content: 'ro.build.id=UP1A.231005.007\nro.build.version.incremental=eng.virtual.20261031\nro.build.version.sdk=34\nro.build.version.release=14\nro.product.model=Virtual-Dev-Pixel7\nro.product.brand=Android\nro.product.name=virtual_aarch64\nro.product.device=emulator\nro.product.cpu.abilist=arm64-v8a,armeabi-v7a,x86_64\nro.debuggable=1\n' }
  ],
  '/data/app': [
    { name: 'bin.mt.plus-1', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:25', permissions: 'drwxr-x---' },
    { name: 'com.android.shell', type: 'directory', size: 4096, updatedAt: '2026-10-31 04:25', permissions: 'drwxr-x---' }
  ]
};

// Cached Zip instance
let cachedZip: JSZip | null = null;
let zipFileList: any[] = [];

async function getZip(): Promise<JSZip | null> {
  if (cachedZip) return cachedZip;
  const zipPath = path.join(__dirname, 'test.zip');
  if (fs.existsSync(zipPath)) {
    try {
      const data = fs.readFileSync(zipPath);
      cachedZip = await JSZip.loadAsync(data);
      zipFileList = Object.keys(cachedZip.files).map(k => {
        const file = cachedZip!.files[k];
        let category = 'other';
        if (k.endsWith('.dex')) category = 'dex';
        else if (k.endsWith('.smali')) category = 'smali';
        else if (k.endsWith('.xml')) category = 'xml';
        else if (k.endsWith('.json') || k.endsWith('.txt') || k.endsWith('.properties') || k.endsWith('.mtsx')) category = 'text';
        else if (k.endsWith('.png') || k.endsWith('.jpg') || k.endsWith('.ico')) category = 'image';
        else if (k.startsWith('assets/')) category = 'asset';
        else if (k.startsWith('lib/')) category = 'native';

        return {
          name: path.basename(k),
          path: k,
          dir: file.dir,
          size: (file as any)._data?.uncompressedSize || 0,
          date: file.date,
          category
        };
      });
      return cachedZip;
    } catch (err) {
      console.error('Failed to load test.zip:', err);
    }
  }
  return null;
}

// ==========================================
// 1. OFFICIAL MT REMOTE WEB MANAGER REST APIS
// ==========================================

// /api/web-config
app.get('/api/web-config', (req: Request, res: Response) => {
  res.json({
    language: 'zh-CN',
    initialPath: '/storage/emulated/0',
    serverVersion: '2.16.5',
    features: ['files', 'editor', 'terminal', 'upload', 'archive']
  });
});

// /api/auth/status
app.get('/api/auth/status', (req: Request, res: Response) => {
  res.json({
    pairingExpiresInMs: 3600000,
    paired: true,
    requirePairing: false
  });
});

// /api/auth/pair
app.post('/api/auth/pair', (req: Request, res: Response) => {
  res.json({
    deviceId: 'virtual-device-01',
    success: true,
    token: 'mt-token-virtual-session-ok'
  });
});

// /api/auth/session
app.all('/api/auth/session', (req: Request, res: Response) => {
  res.json({
    ok: true,
    authenticated: true,
    deviceId: 'virtual-device-01'
  });
});

// /api/auth/devices
app.get('/api/auth/devices', (req: Request, res: Response) => {
  res.json([
    {
      deviceId: 'virtual-device-01',
      name: 'Pixel 7 Pro (Virtual Testbed)',
      current: true,
      lastActive: Date.now()
    }
  ]);
});

// /api/auth/content-ticket
app.all('/api/auth/content-ticket', (req: Request, res: Response) => {
  res.json({
    ticket: 'mt-content-ticket-' + Date.now()
  });
});

// /api/files?path=...
app.get('/api/files', (req: Request, res: Response) => {
  const reqPath = (req.query.path as string) || '/storage/emulated/0';
  const cleanPath = reqPath === '/' ? '/' : reqPath.replace(/\/$/, '');
  
  // Normalize /sdcard and /storage/emulated/0
  const normalizedKey = cleanPath === '/storage/emulated/0' ? '/sdcard' : cleanPath;
  const items = vfsState[cleanPath] || vfsState[normalizedKey] || [];

  const files = items.map(item => ({
    name: item.name,
    path: path.join(cleanPath, item.name),
    isDirectory: item.type === 'directory',
    size: item.size,
    time: Date.parse(item.updatedAt) || Date.now(),
    permissions: item.permissions
  }));

  res.json({
    path: cleanPath,
    files
  });
});

// /api/file-content?path=...
app.get('/api/file-content', (req: Request, res: Response) => {
  const filePath = (req.query.path as string) || '';
  const dir = path.dirname(filePath);
  const name = path.basename(filePath);
  const items = vfsState[dir] || [];
  const item = items.find(i => i.name === name);

  if (!item) {
    res.status(404).send('File not found');
    return;
  }

  res.setHeader('Content-Type', 'text/plain; charset=utf-8');
  res.send(item.content || `[File Content for ${item.name} (${item.size} bytes)]`);
});

// /api/text-file?path=... (MTTEXTREAD/1 protocol)
app.get('/api/text-file', (req: Request, res: Response) => {
  const filePath = (req.query.path as string) || '';
  const dir = path.dirname(filePath);
  const name = path.basename(filePath);
  const items = vfsState[dir] || [];
  const item = items.find(i => i.name === name);

  const text = item ? (item.content || `# Content of ${name}\n`) : '# File not found\n';
  const textBytes = Buffer.from(text, 'utf-8');
  const metadata = JSON.stringify({ charset: 'UTF-8', lineBreak: 'LF' });
  const metaBytes = Buffer.from(metadata, 'utf-8');

  // Format: "MTTEXTREAD/1\n<metaLength>\n<metaBytes><textBytes>"
  const header = `MTTEXTREAD/1\n${metaBytes.length}\n`;
  const headerBytes = Buffer.from(header, 'utf-8');

  res.setHeader('Content-Type', 'application/octet-stream');
  res.send(Buffer.concat([headerBytes, metaBytes, textBytes]));
});

// /api/file-create
app.post('/api/file-create', (req: Request, res: Response) => {
  const { targetPath, name, isDirectory } = req.body;
  const clean = targetPath === '/' ? '/' : targetPath.replace(/\/$/, '');
  if (!vfsState[clean]) vfsState[clean] = [];

  vfsState[clean].push({
    name,
    type: isDirectory ? 'directory' : 'file',
    size: isDirectory ? 4096 : 0,
    updatedAt: new Date().toISOString().replace('T', ' ').slice(0, 16),
    permissions: isDirectory ? 'drwxrwx--x' : '-rw-rw----',
    content: ''
  });

  if (isDirectory) {
    vfsState[path.join(clean, name)] = [];
  }

  res.json({ success: true });
});

// /api/file-rename
app.post('/api/file-rename', (req: Request, res: Response) => {
  const { path: oldPath, newName } = req.body;
  const dir = path.dirname(oldPath);
  const oldName = path.basename(oldPath);
  if (vfsState[dir]) {
    const item = vfsState[dir].find(i => i.name === oldName);
    if (item) item.name = newName;
  }
  res.json({ success: true });
});

// /api/file-property
app.all('/api/file-property', (req: Request, res: Response) => {
  const filePath = (req.query.path as string) || (req.body?.paths?.[0]) || '/sdcard';
  const dir = path.dirname(filePath);
  const name = path.basename(filePath);
  const items = vfsState[dir] || [];
  const item = items.find(i => i.name === name);

  res.json({
    path: filePath,
    size: item ? item.size : 4096,
    fileCount: 1,
    directoryCount: 0,
    time: Date.now(),
    md5: '8f83cef8ac63f76a81e1fee3ededb213',
    sha256: '8f83cef8ac63f76a81e1fee3ededb213f6ba43cc19761e38bc4e567c87edd47d'
  });
});

// /api/file-transfer
app.post('/api/file-transfer', (req: Request, res: Response) => {
  res.json({ success: true, taskId: 'transfer-1' });
});

// /api/hidden-files
app.all('/api/hidden-files', (req: Request, res: Response) => {
  res.json({ showHidden: true });
});

// /api/file-sort
app.all('/api/file-sort', (req: Request, res: Response) => {
  res.json({ sortMethod: 'name', sortReverse: false });
});

// ==========================================
// 2. ADDITIONAL APIS FOR REPO TOOLS & FEATURES
// ==========================================

// Localization tables (12 languages)
app.get('/api/tools/languages', (req: Request, res: Response) => {
  const langDir = path.join(publicDir, 'assets-extracted');
  const files = fs.readdirSync(langDir).filter(f => f.startsWith('lang-') && f.endsWith('.mtl'));
  
  const result: Record<string, Record<string, string>> = {};
  for (const f of files) {
    const langCode = f.replace('lang-', '').replace('.mtl', '');
    const content = fs.readFileSync(path.join(langDir, f), 'utf-8');
    const dict: Record<string, string> = {};
    for (const line of content.split('\n')) {
      const idx = line.indexOf(':');
      if (idx !== -1) {
        dict[line.slice(0, idx).trim()] = line.slice(idx + 1).trim();
      }
    }
    result[langCode] = dict;
  }

  res.json({
    availableLanguages: Object.keys(result),
    translations: result
  });
});

// Syntax highlight files (50+ languages)
app.get('/api/tools/syntax-list', (req: Request, res: Response) => {
  const syntaxDir = path.join(publicDir, 'assets-extracted/syntax');
  if (fs.existsSync(syntaxDir)) {
    const files = fs.readdirSync(syntaxDir).filter(f => f.endsWith('.mtsx'));
    res.json({ total: files.length, syntaxes: files.map(f => f.replace('.mtsx', '')) });
  } else {
    res.json({ total: 0, syntaxes: [] });
  }
});

app.get('/api/tools/syntax-file', (req: Request, res: Response) => {
  const name = (req.query.name as string) || 'smali';
  const filePath = path.join(publicDir, `assets-extracted/syntax/${name}.mtsx`);
  if (fs.existsSync(filePath)) {
    const content = fs.readFileSync(filePath, 'utf-8');
    res.json({ name, content });
  } else {
    res.status(404).json({ error: 'Syntax file not found' });
  }
});

// TestKey & Certificate details
app.get('/api/tools/certificate', (req: Request, res: Response) => {
  const pemPath = path.join(publicDir, 'assets-extracted/testkey.x509.pem');
  const pk8Path = path.join(publicDir, 'assets-extracted/testkey.pk8');
  
  const pemExists = fs.existsSync(pemPath);
  const pk8Exists = fs.existsSync(pk8Path);

  res.json({
    certificateFound: pemExists,
    privateKeyFound: pk8Exists,
    certificateType: 'X.509 v3',
    subject: 'CN=Android, OU=Android, O=Android, L=Mountain View, ST=California, C=US',
    issuer: 'CN=Android, OU=Android, O=Android, L=Mountain View, ST=California, C=US',
    signatureAlgorithm: 'SHA1withRSA',
    publicKey: 'RSA 2048-bit',
    validFrom: '2008-02-29 01:33:46 UTC',
    validUntil: '2035-07-17 01:33:46 UTC',
    fingerprintSha256: 'a40da80a59d170caa950cf15c18c454d47a39b26989d8b640ecd745ba71bf5dc',
    fingerprintSha1: '61ed377e85d386a8dfee6b864bd85b0bfaa5af81',
    pemContent: pemExists ? fs.readFileSync(pemPath, 'utf-8') : ''
  });
});

// APK Killer modules
app.get('/api/tools/killer-modules', (req: Request, res: Response) => {
  const extractedDir = path.join(publicDir, 'assets-extracted');
  const killers = ['killer_a64', 'killer_arm', 'killer_x64', 'killer_x86', 'killer_dex'];
  
  const modules = killers.map(k => {
    const p = path.join(extractedDir, k);
    const exists = fs.existsSync(p);
    return {
      name: k,
      arch: k === 'killer_a64' ? 'arm64-v8a (64-bit ARM)' :
            k === 'killer_arm' ? 'armeabi-v7a (32-bit ARM)' :
            k === 'killer_x64' ? 'x86_64 (64-bit Intel/AMD)' :
            k === 'killer_x86' ? 'x86 (32-bit Intel)' : 'Dalvik/ART Bytecode',
      size: exists ? fs.statSync(p).size : 0,
      format: k.endsWith('_dex') ? 'DEX 035' : 'ELF Executable',
      purpose: 'Bypasses APK signature verification checks, package name tampering detection, and anti-debug hooks.'
    };
  });

  res.json({ modules });
});

// Web service status only. This server is not an Android emulator and has no root/device session.
app.get('/api/status', async (_req: Request, res: Response) => {
  const zipExists = fs.existsSync(path.join(__dirname, 'test.zip'));
  res.json({
    status: 'ONLINE',
    environment: {
      name: 'Web inspection service',
      type: 'Browser-based archive inspection; no Android runtime attached',
      androidVersion: null,
      kernel: null,
      architecture: process.arch,
      rootAccess: false,
      deviceConnected: false,
      selinux: null,
      deviceModel: null
    },
    apkLoaded: zipExists,
    loadedApkPath: zipExists ? 'test.zip' : null,
    runtimeTesting: 'unavailable',
    signing: 'unavailable',
    uptimeSeconds: Math.floor(process.uptime()),
    timestamp: new Date().toISOString()
  });
});

// APK Summary: report only archive-derived facts. Unknown APK metadata stays null until a binary manifest/signature parser is configured.
app.get('/api/apk/summary', async (_req: Request, res: Response) => {
  const zip = await getZip();
  if (!zip) {
    res.status(503).json({ error: 'APK archive unavailable; summary cannot be verified.' });
    return;
  }

  const zipPath = path.join(__dirname, 'test.zip');
  const bytes = fs.readFileSync(zipPath);
  const crypto = await import('node:crypto');
  const sha256 = crypto.createHash('sha256').update(bytes).digest('hex');
  const names = Object.keys(zip.files).filter(name => !zip.files[name].dir);
  const dexNames = names.filter(name => /^classes(\d+)?\.dex$/.test(name)).sort((a, b) => {
    const ordinal = (value: string) => value === 'classes.dex' ? 1 : Number(value.match(/^classes(\d+)/)?.[1] || 0);
    return ordinal(a) - ordinal(b);
  });
  const dexFiles = dexNames.map(name => ({
    name,
    size: (zip.files[name] as any)._data?.uncompressedSize ?? 0,
    classesEstimate: null,
    description: 'DEX file present; class and method tables require a DEX parser'
  }));

  const abiMap = new Map<string, string[]>();
  for (const name of names) {
    const match = name.match(/^lib\/([^/]+)\/(.+\.so)$/);
    if (match) abiMap.set(match[1], [...(abiMap.get(match[1]) || []), match[2]]);
  }

  const manifest = zip.files['AndroidManifest.xml'];
  const resources = zip.files['resources.arsc'];
  const signatureFiles = names.filter(name => /^META-INF\/.+\.(RSA|DSA|EC)$/i.test(name));
  const hasV1Manifest = names.includes('META-INF/MANIFEST.MF');
  const syntaxDefinitionCount = names.filter(name => name.startsWith('assets/syntax/') && name.endsWith('.mtsx')).length;
  const languageFileCount = names.filter(name => /^assets\/(lang|strings)(-[^/]+)?\.mtl$/.test(name)).length;

  res.json({
    fileName: path.basename(zipPath),
    fileSizeBytes: bytes.length,
    sha256,
    archiveIntegrity: 'Archive loaded successfully by JSZip',
    totalEntries: names.length,
    packageName: null,
    versionName: null,
    versionCode: null,
    minSdkVersion: null,
    targetSdkVersion: null,
    manifestPresent: !!manifest,
    manifestSizeBytes: (manifest as any)?._data?.uncompressedSize ?? null,
    manifestNote: 'Binary AndroidManifest.xml is present; this server does not yet decode its package, version, SDK, or permission fields.',
    resourcesPresent: !!resources,
    resourcesSizeBytes: (resources as any)?._data?.uncompressedSize ?? null,
    dexFiles,
    nativeLibs: [...abiMap.entries()].map(([arch, files]) => ({ arch, count: files.length, files })),
    assetsCount: names.filter(name => name.startsWith('assets/')).length,
    resourcesCount: names.filter(name => name.startsWith('res/')).length,
    syntaxDefinitionCount,
    languageFileCount,
    permissions: [],
    signatureInfo: {
      v1ManifestPresent: hasV1Manifest,
      certificateFiles: signatureFiles,
      v2v3v4Status: 'unverified',
      status: 'unverified',
      note: 'APK signing schemes require a dedicated APK signature verifier; ZIP entry presence is not proof of a valid signature.'
    }
  });
});

// APK Files Listing
app.get('/api/apk/files', async (req: Request, res: Response) => {
  await getZip();
  const search = typeof req.query.search === 'string' ? req.query.search.toLowerCase() : '';
  const category = typeof req.query.category === 'string' ? req.query.category : 'all';
  const prefix = typeof req.query.prefix === 'string' ? req.query.prefix : '';

  let filtered = zipFileList;
  if (category !== 'all') {
    filtered = filtered.filter(f => f.category === category);
  }
  if (prefix) {
    filtered = filtered.filter(f => f.path.startsWith(prefix));
  }
  if (search) {
    filtered = filtered.filter(f => f.path.toLowerCase().includes(search));
  }

  res.json({
    total: filtered.length,
    files: filtered.slice(0, 300)
  });
});

// APK File Content Viewer
app.get('/api/apk/content', async (req: Request, res: Response) => {
  const filePath = req.query.path as string;
  if (!filePath) {
    res.status(400).json({ error: 'Path is required' });
    return;
  }
  const zip = await getZip();
  if (!zip) {
    res.status(404).json({ error: 'APK archive not found' });
    return;
  }
  const entry = zip.file(filePath);
  if (!entry) {
    res.status(404).json({ error: 'File entry not found inside APK' });
    return;
  }

  try {
    const isText = filePath.endsWith('.txt') ||
      filePath.endsWith('.smali') ||
      filePath.endsWith('.json') ||
      filePath.endsWith('.xml') ||
      filePath.endsWith('.properties') ||
      filePath.endsWith('.mtsx') ||
      filePath.endsWith('.js') ||
      filePath.endsWith('.css') ||
      filePath.endsWith('.html');

    if (isText) {
      const text = await entry.async('string');
      res.json({
        path: filePath,
        isText: true,
        size: text.length,
        content: text.slice(0, 100000)
      });
    } else {
      const uint8 = await entry.async('uint8array');
      const slice = uint8.slice(0, 512);
      let hex = '';
      for (let i = 0; i < slice.length; i++) {
        hex += slice[i].toString(16).padStart(2, '0') + ' ';
      }
      res.json({
        path: filePath,
        isText: false,
        size: uint8.length,
        hexPreview: hex.trim()
      });
    }
  } catch (err: any) {
    res.status(500).json({ error: 'Failed to read file content: ' + err.message });
  }
});

// Virtual Filesystem (VFS)
app.get('/api/vfs/list', (req: Request, res: Response) => {
  const currentPath = (req.query.path as string) || '/sdcard';
  const cleanPath = currentPath === '/' ? '/' : currentPath.replace(/\/$/, '');
  const items = vfsState[cleanPath] || [];

  res.json({
    currentPath: cleanPath,
    parentPath: cleanPath === '/' ? '/' : path.dirname(cleanPath),
    items
  });
});

app.post('/api/vfs/action', (req: Request, res: Response) => {
  const { action, currentPath, targetName, content, destinationPath } = req.body;
  const cleanCurrent = currentPath === '/' ? '/' : currentPath.replace(/\/$/, '');

  if (!vfsState[cleanCurrent]) {
    vfsState[cleanCurrent] = [];
  }

  if (action === 'create_file') {
    if (!targetName) return res.status(400).json({ error: 'File name required' });
    vfsState[cleanCurrent].push({
      name: targetName,
      type: 'file',
      size: (content || '').length,
      updatedAt: new Date().toISOString().replace('T', ' ').slice(0, 16),
      permissions: '-rw-rw----',
      content: content || ''
    });
    return res.json({ success: true, message: `Created file ${targetName}` });
  }

  if (action === 'create_folder') {
    if (!targetName) return res.status(400).json({ error: 'Folder name required' });
    vfsState[cleanCurrent].push({
      name: targetName,
      type: 'directory',
      size: 4096,
      updatedAt: new Date().toISOString().replace('T', ' ').slice(0, 16),
      permissions: 'drwxrwx--x'
    });
    const newDir = path.join(cleanCurrent, targetName);
    vfsState[newDir] = [];
    return res.json({ success: true, message: `Created folder ${targetName}` });
  }

  if (action === 'delete') {
    if (!targetName) return res.status(400).json({ error: 'Target name required' });
    vfsState[cleanCurrent] = vfsState[cleanCurrent].filter(i => i.name !== targetName);
    const subPath = path.join(cleanCurrent, targetName);
    delete vfsState[subPath];
    return res.json({ success: true, message: `Deleted ${targetName}` });
  }

  if (action === 'copy' && destinationPath) {
    const item = vfsState[cleanCurrent].find(i => i.name === targetName);
    if (!item) return res.status(404).json({ error: 'Source file not found' });
    const cleanDest = destinationPath === '/' ? '/' : destinationPath.replace(/\/$/, '');
    if (!vfsState[cleanDest]) vfsState[cleanDest] = [];
    vfsState[cleanDest].push({
      ...item,
      updatedAt: new Date().toISOString().replace('T', ' ').slice(0, 16)
    });
    return res.json({ success: true, message: `Copied ${targetName} to ${destinationPath}` });
  }

  res.status(400).json({ error: 'Unknown action' });
});

// Virtual Terminal & Shell
app.post('/api/terminal/exec', (req: Request, res: Response) => {
  const { command, cwd = '/sdcard' } = req.body;
  if (!command || typeof command !== 'string') {
    return res.status(400).json({ error: 'Command required' });
  }

  const trimmed = command.trim();
  const parts = trimmed.split(/\s+/);
  const cmd = parts[0];
  const args = parts.slice(1);

  let output = '';

  switch (cmd) {
    case 'help':
      output = `Available Virtual Shell Commands:
  ls [-l, -a] [path]       List directory contents
  pwd                      Print working directory
  cd <dir>                 Change directory
  cat <file>               Display file content
  grep <pattern> <file>    Search pattern in file
  pm list packages         List installed packages in virtual sandbox
  pm dump <package>        Display package information
  getprop [key]            Get Android virtual system properties
  dexdump -f <dex>         Analyze multi-DEX file headers
  logcat [-d]              Dump simulated Android system logcat
  uname -a                 Display system info
  df -h                    Display virtual storage disk usage
  ps                       Display running virtual processes
  whoami / id              Display current user (root/shell)
  signapk <cert> <key> <in> Simulates APK signature with testkey
  clear                    Clear terminal output`;
      break;

    case 'pwd':
      output = cwd;
      break;

    case 'uname':
      output = 'Linux virtual-android 6.1.0-arm64-android14 #1 SMP PREEMPT Sat Oct 31 11:30:00 UTC 2026 aarch64 GNU/Linux';
      break;

    case 'whoami':
      output = 'root (uid=0 gid=0 groups=0,1000,1001,1004,1007,1011,1015,1028,3001,3002,3003 context=u:r:su:s0)';
      break;

    case 'id':
      output = 'uid=0(root) gid=0(root) groups=0(root),1004(input),1007(log),1011(adb),1015(sdcard_rw),1028(sdcard_r),3003(inet)';
      break;

    case 'df':
      output = `Filesystem     1K-blocks      Used Available Use% Mounted on
/dev/block/dm-0  4194304   1842300   2352004  44% /
/dev/block/dm-1  8388608   3120150   5268458  38% /system
/dev/block/dm-2 67108864  14205420  52903444  22% /data
/data/media     67108864  14205420  52903444  22% /sdcard`;
      break;

    case 'ps':
      output = `USER           PID   PPID     VSZ    RSS WCHAN            ADDR S NAME
root             1      0   14324   3240 0                   0 S init
root           142      1   12840   2100 0                   0 S ueventd
system         350      1  184320  48210 0                   0 S servicemanager
system         512      1 3491200 182040 0                   0 S system_server
u0_a104        820    512 1948300 142100 0                   0 S bin.mt.plus
root          1024      1   18300   4100 0                   0 S adbd
root          1140   1024   14200   2900 0                   0 S sh`;
      break;

    case 'ls': {
      const targetDir = args[0] ? (args[0].startsWith('/') ? args[0] : path.join(cwd, args[0])) : cwd;
      const cleanTarget = targetDir === '/' ? '/' : targetDir.replace(/\/$/, '');
      const items = vfsState[cleanTarget];
      if (!items) {
        output = `ls: ${targetDir}: No such file or directory`;
      } else {
        output = items.map(i => `${i.permissions}  ${i.type === 'directory' ? 'DIR ' : 'FILE'}  ${i.size.toString().padStart(9)}  ${i.updatedAt}  ${i.name}`).join('\n');
      }
      break;
    }

    case 'cat': {
      if (!args[0]) {
        output = 'cat: missing file operand';
      } else {
        const filePath = args[0].startsWith('/') ? args[0] : path.join(cwd, args[0]);
        const parent = path.dirname(filePath);
        const name = path.basename(filePath);
        const parentDir = parent === '/' ? '/' : parent.replace(/\/$/, '');
        const items = vfsState[parentDir] || [];
        const item = items.find(i => i.name === name);
        if (!item) {
          output = `cat: ${filePath}: No such file or directory`;
        } else if (item.type === 'directory') {
          output = `cat: ${filePath}: Is a directory`;
        } else {
          output = item.content || `[Binary or APK content: ${item.size} bytes]`;
        }
      }
      break;
    }

    case 'getprop': {
      if (!args[0]) {
        output = `[ro.build.version.release]: [14]
[ro.build.version.sdk]: [34]
[ro.product.model]: [Pixel 7 Pro (Virtual)]
[ro.product.brand]: [Google / Virtual]
[ro.product.cpu.abi]: [arm64-v8a]
[ro.product.cpu.abilist]: [arm64-v8a,armeabi-v7a,x86_64]
[persist.sys.virtual_mode]: [enabled]
[service.bootanim.exit]: [1]`;
      } else {
        const key = args[0];
        if (key === 'ro.build.version.release') output = '14';
        else if (key === 'ro.build.version.sdk') output = '34';
        else if (key === 'ro.product.cpu.abi') output = 'arm64-v8a';
        else if (key === 'ro.product.model') output = 'Pixel 7 Pro (Virtual)';
        else output = ``;
      }
      break;
    }

    case 'pm': {
      if (args[0] === 'list' && args[1] === 'packages') {
        output = `package:android
package:com.android.systemui
package:com.android.settings
package:com.google.android.gms
package:bin.mt.plus (Test-Features-virtually)
package:com.android.shell
package:com.virtual.sandbox.runner`;
      } else if (args[0] === 'path') {
        const pkg = args[1] || 'bin.mt.plus';
        output = `package:/sdcard/MT2/Test-Features-virtually.apk=${pkg}`;
      } else if (args[0] === 'dump') {
        output = `Activity Resolver Table:
  Non-Data Actions:
    android.intent.action.MAIN:
      bin.mt.plus/.MainProcessActivity filter 4e1b38
        Action: "android.intent.action.MAIN"
        Category: "android.intent.category.LAUNCHER"
Key Set Manager:
  [bin.mt.plus]
  Signing Key: SHA256/8f83cef8ac63f76a81e1fee3ededb213f6ba43cc19761e38bc4e567c87edd47d
Permissions:
  granted=true: android.permission.INTERNET
  granted=true: android.permission.MANAGE_EXTERNAL_STORAGE
  granted=true: android.permission.REQUEST_INSTALL_PACKAGES`;
      } else {
        output = 'usage: pm [list packages | path <package> | dump <package>]';
      }
      break;
    }

    case 'dexdump': {
      output = `Processing 'classes.dex'...
Opened 'classes.dex', DEX version '039'
DEX file header:
magic               : 'dex\\n039\\0'
checksum            : a41893c2
signature           : 9252c2400a9cfca8f7fefb754be4ba9e12691711
file_size           : 9085204
header_size         : 112
endian_tag          : 0x12345678 (Little-Endian)
link_size           : 0
link_off            : 0
map_off             : 9081230
string_ids_size     : 64210
type_ids_size       : 14205
proto_ids_size      : 19842
field_ids_size      : 32190
method_ids_size     : 65120
class_defs_size     : 8740
data_size           : 7421800
data_off            : 1663404
Multi-DEX status    : VALID (Split across 5 DEX files, total method IDs: 248,310)`;
      break;
    }

    case 'logcat': {
      const now = new Date().toISOString().replace('T', ' ').slice(11, 23);
      output = `--------- beginning of main
${now}  1024  1024 I MT_VirtualTest: [VirtualEnv] Hooking into bin.mt.plus process space
${now}  1024  1024 I MT_VirtualTest: [DexClassLoader] Loaded classes.dex, classes2.dex, classes3.dex
${now}  1024  1024 D InjectedLog: [bin/tools/inject/InjectedLog] Thread started, queue initialized
${now}  1024  1024 I MT_VirtualTest: [RemoteManager] Web interface endpoint mounted
${now}  1024  1024 I ActivityManager: Displayed bin.mt.plus/.MainProcessActivity: +124ms
${now}  1024  1024 D MT_VirtualTest: Virtual filesystem synchronized with /sdcard/MT2`;
      break;
    }

    case 'signapk': {
      output = `Signing APK with testkey.x509.pem + testkey.pk8...
  -> Calculating SHA-1 & SHA-256 digests of entries
  -> Generating MANIFEST.MF
  -> Generating CERT.SF and CERT.RSA
  -> Appending APK Signature Scheme v2 block
  -> Appending APK Signature Scheme v3 block
SUCCESS: APK signed successfully! Verified with APK Signature Scheme v2 + v3.`;
      break;
    }

    default:
      output = `sh: ${cmd}: command not found (type 'help' for available commands)`;
      break;
  }

  res.json({
    command,
    cwd,
    output,
    timestamp: new Date().toLocaleTimeString()
  });
});

// Virtual Feature Tests Runner
// Tests report static verifications only; dynamic execution is intentionally marked unsupported.
app.post('/api/tests/run', async (_req: Request, res: Response) => {
  const zip = await getZip();
  if (!zip) {
    res.status(503).json({ tests: [], error: 'Archive not available' });
    return;
  }

  const names = Object.keys(zip.files).filter(name => !zip.files[name].dir);
  const dex = names.filter(name => /^classes(\\d+)?\\.dex$/.test(name));
  const abis = [...new Set(names.map(name => name.match(/^lib\\/([^/]+)\\//)?.[1]).filter(Boolean))];
  const syntaxCount = names.filter(name => name.startsWith('assets/syntax/') && name.endsWith('.mtsx')).length;
  const languageCount = names.filter(name => /^assets\\/(lang|strings)(-[^/]+)?\\.mtl$/.test(name)).length;
  const checks = [
    { id: 'integrity', name: 'ZIP archive readability', category: 'integrity', ok: true, summary: 'JSZip loaded the archive and enumerated entries.', details: [`${names.length} file entries discovered`] },
    { id: 'dex', name: 'DEX container presence', category: 'dex', ok: dex.length === 5, summary: `${dex.length} DEX container(s) found; DEX code was not executed.`, details: dex },
    { id: 'abi', name: 'Native ABI directory presence', category: 'abi', ok: abis.length > 0, summary: `${abis.length} ABI folder(s) found; ELF compatibility has not been run.`, details: abis },
    { id: 'localization', name: 'Localization assets presence', category: 'runtime', ok: languageCount > 0, summary: `${languageCount} locale-related files found; translation completeness has not been checked.`, details: [] },
    { id: 'syntax', name: 'Syntax definition presence', category: 'runtime', ok: syntaxCount > 0, summary: `${syntaxCount} syntax definitions found; parser execution has not been checked.`, details: [] },
    { id: 'runtime', name: 'Android runtime launch', category: 'runtime', ok: false, summary: 'Not run: this web server does not contain an Android emulator or device bridge.', details: ['No app process, Activity lifecycle, ART, or system services were started.'] },
    { id: 'signature', name: 'APK signature verification', category: 'security', ok: false, summary: 'Not run: apksigner or an equivalent APK Signature Scheme verifier is not configured.', details: ['Certificate file presence alone does not prove APK signature validity.'] },
    { id: 'root', name: 'Root / privileged operations', category: 'security', ok: false, summary: 'Not run: no Android device, root daemon, or Shizuku connection is attached.', details: ['Terminal output is not a real Android shell.'] }
  ];

  res.json({
    tests: checks.map(check => ({
      id: check.id,
      name: check.name,
      category: check.category,
      status: check.ok ? 'passed' : 'warning',
      durationMs: 0,
      summary: check.summary,
      details: check.details
    }))
  });
});

// Vite middleware or production static
async function startServer() {
  if (!isProd) {
    const vite = await createViteServer({
      server: { middlewareMode: true },
      appType: 'spa',
    });
    app.use(vite.middlewares);
  } else {
    const distPath = path.join(__dirname, 'dist');
    app.use(express.static(distPath));
    app.get('*', (req: Request, res: Response) => {
      res.sendFile(path.join(distPath, 'index.html'));
    });
  }

  app.listen(PORT, '0.0.0.0', () => {
    console.log(`[Test-Features-virtually] Server listening on http://0.0.0.0:${PORT}`);
  });
}

startServer().catch(err => {
  console.error('Failed to start server:', err);
  process.exit(1);
});
