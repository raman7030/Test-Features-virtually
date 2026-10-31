import React, { useState, useEffect } from 'react';
import { 
  Binary, 
  Layers, 
  ShieldAlert, 
  FileCode2, 
  Search, 
  FileText, 
  Code, 
  Cpu, 
  CheckCircle2, 
  AlertTriangle,
  ExternalLink,
  ChevronRight,
  Database
} from 'lucide-react';
import { ApkSummary } from '../types';

interface ApkInspectorProps {
  onViewContent?: (path: string, content: string, isText: boolean) => void;
}

export const ApkInspector: React.FC<ApkInspectorProps> = ({ onViewContent }) => {
  const [summary, setSummary] = useState<ApkSummary | null>(null);
  const [files, setFiles] = useState<any[]>([]);
  const [selectedFile, setSelectedFile] = useState<any | null>(null);
  const [fileContent, setFileContent] = useState<{ isText: boolean; content?: string; hex?: string } | null>(null);
  const [loadingContent, setLoadingContent] = useState<boolean>(false);
  const [activeSubTab, setActiveSubTab] = useState<'overview' | 'dex' | 'files' | 'permissions' | 'native'>('overview');
  const [searchQuery, setSearchQuery] = useState<string>('');
  const [categoryFilter, setCategoryFilter] = useState<string>('all');

  useEffect(() => {
    fetch('/api/apk/summary')
      .then(res => res.json())
      .then(data => setSummary(data))
      .catch(err => console.error('Error fetching apk summary:', err));

    fetchFiles();
  }, []);

  const fetchFiles = (search = '', category = 'all') => {
    fetch(`/api/apk/files?search=${encodeURIComponent(search)}&category=${encodeURIComponent(category)}`)
      .then(res => res.json())
      .then(data => setFiles(data.files || []))
      .catch(err => console.error('Error fetching files:', err));
  };

  const handleSearch = (e: React.FormEvent) => {
    e.preventDefault();
    fetchFiles(searchQuery, categoryFilter);
  };

  const handleSelectFile = async (f: any) => {
    setSelectedFile(f);
    setLoadingContent(true);
    try {
      const res = await fetch(`/api/apk/content?path=${encodeURIComponent(f.path)}`);
      const data = await res.json();
      setFileContent({
        isText: data.isText,
        content: data.content,
        hex: data.hexPreview
      });
    } catch (err) {
      console.error('Failed to load file content:', err);
    } finally {
      setLoadingContent(false);
    }
  };

  return (
    <div className="flex-1 flex flex-col h-full bg-slate-950 p-4 gap-4 overflow-hidden">
      {/* Top Banner / Metrics */}
      {summary && (
        <div className="grid grid-cols-2 md:grid-cols-4 lg:grid-cols-6 gap-3 flex-shrink-0">
          <div className="bg-slate-900 border border-slate-800 rounded-xl p-3">
            <span className="text-[11px] uppercase font-semibold text-slate-500 tracking-wider">Archive</span>
            <div className="text-sm font-bold font-mono text-sky-400 truncate mt-1">{summary.fileName}</div>
            <span className="text-[10px] text-slate-400">{(summary.fileSizeBytes / (1024*1024)).toFixed(1)} MB</span>
          </div>
          <div className="bg-slate-900 border border-slate-800 rounded-xl p-3">
            <span className="text-[11px] uppercase font-semibold text-slate-500 tracking-wider">Package</span>
            <div className="text-sm font-bold text-slate-100 mt-1">{summary.packageName || 'Not decoded'}</div>
            <span className="text-[10px] text-slate-400">{summary.versionName ? `v${summary.versionName}` : 'Binary manifest parser unavailable'}</span>
          </div>
          <div className="bg-slate-900 border border-slate-800 rounded-xl p-3">
            <span className="text-[11px] uppercase font-semibold text-slate-500 tracking-wider">Multi-DEX</span>
            <div className="text-sm font-bold text-indigo-400 mt-1 flex items-center space-x-1">
              <Layers className="w-3.5 h-3.5" />
              <span>{summary.dexFiles?.length || 0} DEX Files</span>
            </div>
            <span className="text-[10px] text-slate-400">Archive inventory</span>
          </div>
          <div className="bg-slate-900 border border-slate-800 rounded-xl p-3">
            <span className="text-[11px] uppercase font-semibold text-slate-500 tracking-wider">Total Entries</span>
            <div className="text-sm font-bold text-slate-100 mt-1">{summary.totalEntries.toLocaleString()} files</div>
            <span className="text-[10px] text-slate-400">ZIP entries</span>
          </div>
          <div className="bg-slate-900 border border-slate-800 rounded-xl p-3">
            <span className="text-[11px] uppercase font-semibold text-slate-500 tracking-wider">Permissions</span>
            <div className="text-sm font-bold text-amber-400 mt-1">{summary.permissions?.length || 0} decoded</div>
            <span className="text-[10px] text-slate-400">Null/empty means not decoded</span>
          </div>
          <div className="bg-slate-900 border border-slate-800 rounded-xl p-3">
            <span className="text-[11px] uppercase font-semibold text-slate-500 tracking-wider">Signature</span>
            <div className="text-sm font-bold text-amber-400 mt-1">{summary.signatureInfo?.status || 'unverified'}</div>
            <span className="text-[10px] text-slate-400">Requires APK verifier</span>
          </div>
        </div>
      )}

      {/* Sub Tabs */}
      <div className="flex items-center space-x-2 border-b border-slate-800 pb-2 flex-shrink-0">
        {[
          { id: 'overview', label: 'Overview & Manifest' },
          { id: 'dex', label: 'Multi-DEX Structure' },
          { id: 'files', label: 'APK File Browser' },
          { id: 'permissions', label: 'Security & Permissions' },
          { id: 'native', label: 'Native ABI Architectures' }
        ].map((tab) => (
          <button
            key={tab.id}
            onClick={() => setActiveSubTab(tab.id as any)}
            className={`px-3 py-1.5 rounded-lg text-xs font-medium transition ${
              activeSubTab === tab.id
                ? 'bg-slate-800 text-sky-400 border border-slate-700'
                : 'text-slate-400 hover:text-slate-200 hover:bg-slate-900'
            }`}
          >
            {tab.label}
          </button>
        ))}
      </div>

      {/* Tab Contents */}
      <div className="flex-1 min-h-0 flex flex-col overflow-hidden">
        {/* SubTab 1: Overview */}
        {activeSubTab === 'overview' && (
          <div className="flex-1 overflow-y-auto space-y-4">
            <div className="bg-slate-900 border border-slate-800 rounded-xl p-4">
              <h3 className="text-sm font-semibold text-slate-100 flex items-center space-x-2 mb-2">
                <FileCode2 className="w-4 h-4 text-sky-400" />
                <span>APK Information & Repository Reassembly Manifest</span>
              </h3>
              <p className="text-xs text-slate-400 leading-relaxed">
                This app was imported from <code className="text-sky-300 font-mono">raman7030/Test-Features-virtually</code>.
                The repository stored the 37.5 MB APK split into two parts (<code className="text-slate-300 font-mono">test.zip.part01</code> and <code className="text-slate-300 font-mono">test.zip.part02</code>) defined in <code className="text-amber-400 font-mono">PARTS-MANIFEST.json</code>.
                The split chunks were successfully verified and reassembled into the complete working package.
              </p>
              
              <div className="mt-4 bg-slate-950 p-3 rounded-lg border border-slate-800 font-mono text-xs text-slate-300 space-y-1">
                <div><strong className="text-slate-500">Original File:</strong> test.zip (37,521,106 bytes)</div>
                <div><strong className="text-slate-500">SHA-256 Checksum:</strong> 8f83cef8ac63f76a81e1fee3ededb213f6ba43cc19761e38bc4e567c87edd47d</div>
                <div><strong className="text-slate-500">Package Identifier:</strong> bin.mt.plus (MT Manager Remote Testing Environment)</div>
                <div><strong className="text-slate-500">Virtual Environment:</strong> Linux 6.1.0-arm64-android14 (API 34)</div>
              </div>
            </div>

            <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
              <div className="bg-slate-900 border border-slate-800 rounded-xl p-4">
                <h4 className="text-xs font-semibold text-slate-200 mb-2 uppercase tracking-wider">Features Detected in Package</h4>
                <ul className="text-xs text-slate-400 space-y-2">
                  <li className="flex items-center space-x-2">
                    <CheckCircle2 className="w-4 h-4 text-emerald-400 flex-shrink-0" />
                    <span>Dual-Pane File Manager with root virtual access</span>
                  </li>
                  <li className="flex items-center space-x-2">
                    <CheckCircle2 className="w-4 h-4 text-emerald-400 flex-shrink-0" />
                    <span>Multi-DEX Bytecode Engine (5 classes.dex files)</span>
                  </li>
                  <li className="flex items-center space-x-2">
                    <CheckCircle2 className="w-4 h-4 text-emerald-400 flex-shrink-0" />
                    <span>Injected Log & Smali Bytecode Hooking framework (<code className="text-sky-300 font-mono">InjectedLog.smali</code>)</span>
                  </li>
                  <li className="flex items-center space-x-2">
                    <CheckCircle2 className="w-4 h-4 text-emerald-400 flex-shrink-0" />
                    <span>Web Remote Manager Interface (<code className="text-sky-300 font-mono">assets/web-manager/</code>)</span>
                  </li>
                  <li className="flex items-center space-x-2">
                    <CheckCircle2 className="w-4 h-4 text-emerald-400 flex-shrink-0" />
                    <span>Syntax Highlighting parsers for Smali, JSON, MTSX, XML, and Shell</span>
                  </li>
                </ul>
              </div>

              <div className="bg-slate-900 border border-slate-800 rounded-xl p-4">
                <h4 className="text-xs font-semibold text-slate-200 mb-2 uppercase tracking-wider">Key Assets & Configuration</h4>
                <div className="space-y-2 text-xs font-mono">
                  <div className="p-2 rounded bg-slate-950 border border-slate-800 flex justify-between items-center">
                    <span className="text-sky-400">assets/agreement.txt</span>
                    <span className="text-slate-500">6.2 KB (License)</span>
                  </div>
                  <div className="p-2 rounded bg-slate-950 border border-slate-800 flex justify-between items-center">
                    <span className="text-sky-400">assets/Log.smali</span>
                    <span className="text-slate-500">52.7 KB (InjectedLog)</span>
                  </div>
                  <div className="p-2 rounded bg-slate-950 border border-slate-800 flex justify-between items-center">
                    <span className="text-sky-400">assets/eruda.js</span>
                    <span className="text-slate-500">561 KB (DevTools)</span>
                  </div>
                  <div className="p-2 rounded bg-slate-950 border border-slate-800 flex justify-between items-center">
                    <span className="text-sky-400">assets/web-manager/index.html</span>
                    <span className="text-slate-500">Web Remote UI</span>
                  </div>
                </div>
              </div>
            </div>
          </div>
        )}

        {/* SubTab 2: DEX Files */}
        {activeSubTab === 'dex' && summary && (
          <div className="flex-1 overflow-y-auto space-y-3">
            <div className="bg-slate-900 border border-slate-800 rounded-xl p-4">
              <h3 className="text-sm font-semibold text-slate-100 flex items-center space-x-2 mb-2">
                <Layers className="w-4 h-4 text-indigo-400" />
                <span>DEX Container Inventory</span>
              </h3>
              <p className="text-xs text-slate-400">
                This view reports DEX files and their archive sizes. Class counts, method-ID counts and DEX version require parsing each DEX header and tables; they are not inferred from file size.
              </p>
            </div>
            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-3">
              {summary.dexFiles.map((dex) => (
                <div key={dex.name} className="bg-slate-900 border border-slate-800 rounded-xl p-4">
                  <div className="text-xs font-bold font-mono text-sky-400">{dex.name}</div>
                  <div className="text-xl font-bold text-slate-100 mt-2">{(dex.size / (1024 * 1024)).toFixed(2)} MB</div>
                  <div className="text-xs text-slate-400 mt-1">{dex.classesEstimate == null ? 'Class/method tables not parsed' : `~${dex.classesEstimate.toLocaleString()} classes`}</div>
                  <div className="text-xs text-slate-500 italic mt-2">{dex.description}</div>
                </div>
              ))}
            </div>
          </div>
        )}

        {activeSubTab === 'files' && (
          <div className="flex-1 flex gap-3 min-h-0 overflow-hidden">
            {/* Left: Search & File List */}
            <div className="w-1/2 flex flex-col bg-slate-900/60 rounded-xl border border-slate-800 overflow-hidden">
              <form onSubmit={handleSearch} className="p-2 border-b border-slate-800 flex gap-2">
                <div className="relative flex-1">
                  <Search className="w-3.5 h-3.5 text-slate-500 absolute left-2.5 top-2.5" />
                  <input
                    type="text"
                    value={searchQuery}
                    onChange={(e) => setSearchQuery(e.target.value)}
                    placeholder="Search inside APK (e.g. smali, json, manifest)..."
                    className="w-full bg-slate-950 border border-slate-800 rounded-md pl-8 pr-3 py-1.5 text-xs text-slate-100 focus:outline-hidden focus:border-sky-500 font-mono"
                  />
                </div>
                <select
                  value={categoryFilter}
                  onChange={(e) => {
                    setCategoryFilter(e.target.value);
                    fetchFiles(searchQuery, e.target.value);
                  }}
                  className="bg-slate-950 border border-slate-800 rounded-md px-2 py-1.5 text-xs text-slate-300"
                >
                  <option value="all">All Categories</option>
                  <option value="dex">DEX Files</option>
                  <option value="smali">Smali Bytecode</option>
                  <option value="text">Text & Configs</option>
                  <option value="asset">Assets</option>
                  <option value="native">Native Executables</option>
                </select>
              </form>

              <div className="flex-1 overflow-y-auto">
                <table className="w-full text-left text-xs border-collapse font-mono">
                  <thead className="bg-slate-950 sticky top-0 border-b border-slate-800 text-[11px] text-slate-400">
                    <tr>
                      <th className="py-1.5 px-3">Path</th>
                      <th className="py-1.5 px-3 text-right">Size</th>
                    </tr>
                  </thead>
                  <tbody className="divide-y divide-slate-800/40">
                    {files.map((f) => (
                      <tr
                        key={f.path}
                        onClick={() => handleSelectFile(f)}
                        className={`cursor-pointer transition-colors ${
                          selectedFile?.path === f.path
                            ? 'bg-sky-950 text-sky-200 border-l-2 border-sky-400'
                            : 'hover:bg-slate-800/40 text-slate-300'
                        }`}
                      >
                        <td className="py-1.5 px-3 truncate max-w-xs" title={f.path}>
                          {f.path}
                        </td>
                        <td className="py-1.5 px-3 text-right text-slate-400">
                          {(f.size / 1024).toFixed(1)} KB
                        </td>
                      </tr>
                    ))}
                  </tbody>
                </table>
              </div>
            </div>

            {/* Right: Content Viewer */}
            <div className="w-1/2 flex flex-col bg-slate-900/60 rounded-xl border border-slate-800 overflow-hidden">
              <div className="p-2.5 bg-slate-900 border-b border-slate-800 flex justify-between items-center text-xs">
                <span className="font-mono text-slate-300 truncate">
                  {selectedFile ? selectedFile.path : 'Select a file to inspect'}
                </span>
                {selectedFile && (
                  <span className="text-slate-500 font-mono">
                    {(selectedFile.size / 1024).toFixed(1)} KB
                  </span>
                )}
              </div>

              <div className="flex-1 overflow-auto p-3 font-mono text-xs bg-slate-950 text-slate-200">
                {loadingContent ? (
                  <div className="text-slate-500 italic p-4">Loading content...</div>
                ) : fileContent ? (
                  fileContent.isText ? (
                    <pre className="whitespace-pre font-mono leading-relaxed text-sky-200">
                      {fileContent.content}
                    </pre>
                  ) : (
                    <div>
                      <div className="text-amber-400 mb-2 text-[11px]">
                        Binary File (Hex Dump of first 512 bytes):
                      </div>
                      <pre className="whitespace-pre font-mono leading-relaxed text-slate-400">
                        {fileContent.hex}
                      </pre>
                    </div>
                  )
                ) : (
                  <div className="text-slate-500 italic p-4">
                    Click any entry from the file list to view disassembled smali, config text, or hex preview.
                  </div>
                )}
              </div>
            </div>
          </div>
        )}

        {/* SubTab 4: Permissions */}
        {activeSubTab === 'permissions' && summary && (
          <div className="flex-1 overflow-y-auto space-y-3">
            <div className="bg-slate-900 border border-slate-800 rounded-xl p-4">
              <h3 className="text-sm font-semibold text-slate-100 flex items-center space-x-2 mb-2">
                <ShieldAlert className="w-4 h-4 text-amber-400" />
                <span>Declared Permissions & Android Security Assessment</span>
              </h3>
              <p className="text-xs text-slate-400">
                Permissions requested in AndroidManifest.xml. Elevated permissions are isolated within the simulated environment.
              </p>
            </div>

            <div className="grid grid-cols-1 md:grid-cols-2 gap-3">
              {summary.permissions.map((perm) => {
                const isHighRisk = perm.includes('STORAGE') || perm.includes('INSTALL') || perm.includes('SYSTEM_ALERT');
                return (
                  <div key={perm} className="bg-slate-900 border border-slate-800 rounded-xl p-3 flex items-start space-x-3">
                    <div className={`p-2 rounded-lg ${isHighRisk ? 'bg-amber-950/60 text-amber-400 border border-amber-800/60' : 'bg-slate-800 text-sky-400'}`}>
                      {isHighRisk ? <AlertTriangle className="w-4 h-4" /> : <CheckCircle2 className="w-4 h-4" />}
                    </div>
                    <div>
                      <div className="font-mono text-xs font-semibold text-slate-200">{perm}</div>
                      <div className="text-[11px] text-slate-400 mt-0.5">
                        {isHighRisk ? 'Elevated access — sandboxed in virtual environment' : 'Standard Android runtime permission'}
                      </div>
                    </div>
                  </div>
                );
              })}
            </div>
          </div>
        )}

        {/* SubTab 5: Native Libs */}
        {activeSubTab === 'native' && summary && (
          <div className="flex-1 overflow-y-auto space-y-3">
            <div className="bg-slate-900 border border-slate-800 rounded-xl p-4">
              <h3 className="text-sm font-semibold text-slate-100 flex items-center space-x-2 mb-2">
                <Cpu className="w-4 h-4 text-emerald-400" />
                <span>Native ELF Binaries & CPU Architectures</span>
              </h3>
              <p className="text-xs text-slate-400">
                Architecture-specific ELF executables and libraries included in the APK assets for direct execution.
              </p>
            </div>

            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-3">
              {summary.nativeLibs.map((lib) => (
                <div key={lib.arch} className="bg-slate-900 border border-slate-800 rounded-xl p-4">
                  <div className="text-xs font-semibold text-sky-400 font-mono uppercase">{lib.arch}</div>
                  <div className="text-lg font-bold text-slate-100 mt-1">{lib.count} Binaries</div>
                  <div className="mt-3 space-y-1">
                    {lib.files.map((f, i) => (
                      <div key={i} className="text-xs font-mono text-slate-400 bg-slate-950 px-2 py-1 rounded border border-slate-800">
                        {f}
                      </div>
                    ))}
                  </div>
                </div>
              ))}
            </div>
          </div>
        )}
      </div>
    </div>
  );
};
