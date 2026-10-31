import React, { useState } from 'react';
import { ExternalLink, RefreshCw, ShieldCheck, Smartphone, Globe, CheckCircle2, Lock } from 'lucide-react';

export const OfficialWebManager: React.FC = () => {
  const [key, setKey] = useState<number>(0);
  const [paired, setPaired] = useState<boolean>(true);

  return (
    <div className="flex-1 flex flex-col h-full bg-slate-950 p-4 gap-3 overflow-hidden">
      {/* Top Banner */}
      <div className="bg-slate-900 border border-slate-800 rounded-xl p-3 flex flex-col md:flex-row md:items-center justify-between gap-3 flex-shrink-0 shadow-md">
        <div className="flex items-center space-x-3">
          <div className="p-2 rounded-lg bg-sky-950 border border-sky-800 text-sky-400">
            <Globe className="w-5 h-5" />
          </div>
          <div>
            <div className="flex items-center space-x-2">
              <h2 className="text-sm font-bold text-slate-100">
                MT Official Web Remote Manager (Embedded)
              </h2>
              <span className="text-[10px] px-2 py-0.5 rounded-full bg-emerald-950 border border-emerald-800 text-emerald-400 font-mono font-medium">
                Live & Connected
              </span>
            </div>
            <p className="text-xs text-slate-400 mt-0.5">
              Extracted directly from <code className="text-sky-300 font-mono">assets/web-manager/</code> in the APK. Connected to virtual device APIs (<code className="text-slate-300 font-mono">/api/files</code>, <code className="text-slate-300 font-mono">/api/web-config</code>, <code className="text-slate-300 font-mono">/api/auth/*</code>).
            </p>
          </div>
        </div>

        <div className="flex items-center space-x-2">
          <div className="flex items-center space-x-1.5 px-2.5 py-1 rounded bg-slate-950 border border-slate-800 text-xs text-slate-300 font-mono">
            <Lock className="w-3.5 h-3.5 text-emerald-400" />
            <span>Pairing: Auto-Authorized</span>
          </div>

          <button
            onClick={() => setKey(prev => prev + 1)}
            title="Reload Web Manager"
            className="flex items-center space-x-1 px-3 py-1.5 rounded-lg bg-slate-800 hover:bg-slate-700 text-slate-200 text-xs font-medium transition"
          >
            <RefreshCw className="w-3.5 h-3.5" />
            <span>Reload</span>
          </button>

          <a
            href="/web-manager/index.html"
            target="_blank"
            rel="noreferrer"
            className="flex items-center space-x-1 px-3 py-1.5 rounded-lg bg-sky-600 hover:bg-sky-500 text-white text-xs font-medium transition shadow-sm"
          >
            <span>Open Standalone</span>
            <ExternalLink className="w-3.5 h-3.5" />
          </a>
        </div>
      </div>

      {/* Embedded Web Manager Frame */}
      <div className="flex-1 rounded-xl border border-slate-800 overflow-hidden bg-slate-900 shadow-xl relative">
        <iframe
          key={key}
          src="/web-manager/index.html"
          title="MT Official Web Remote Manager"
          className="w-full h-full border-0 bg-white dark:bg-slate-950"
        />
      </div>
    </div>
  );
};
