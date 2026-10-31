export interface ApkSummary {
  fileName: string;
  fileSizeBytes: number;
  sha256: string;
  packageName: string;
  versionName: string;
  versionCode: number;
  minSdkVersion: number;
  targetSdkVersion: number;
  totalEntries: number;
  dexFiles: { name: string; size: number; classesEstimate: number }[];
  nativeLibs: { arch: string; count: number; files: string[] }[];
  assetsCount: number;
  resourcesCount: number;
  permissions: string[];
  signatureInfo: {
    scheme: string;
    algorithm: string;
    issuer: string;
    status: 'valid' | 'warning' | 'unverified';
  };
}

export interface VfsNode {
  name: string;
  path: string;
  type: 'file' | 'directory';
  size: number;
  updatedAt: string;
  permissions: string;
  extension?: string;
  isApk?: boolean;
}

export interface TestResult {
  id: string;
  name: string;
  category: 'integrity' | 'security' | 'dex' | 'runtime' | 'abi';
  status: 'passed' | 'warning' | 'failed' | 'running' | 'idle';
  durationMs?: number;
  summary: string;
  details: string[];
}

export interface TerminalLog {
  id: string;
  type: 'command' | 'output' | 'error' | 'system';
  text: string;
  timestamp: string;
}
