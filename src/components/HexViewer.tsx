import React, { useState, useEffect } from 'react';
import { FileCode, Binary, BookOpen, Copy, Check } from 'lucide-react';

interface HexViewerProps {
  initialPath?: string;
}

export const HexViewer: React.FC<HexViewerProps> = ({ initialPath }) => {
  const [selectedPreset, setSelectedPreset] = useState<string>(initialPath || 'assets/Log.smali');
  const [content, setContent] = useState<string>('');
  const [isText, setIsText] = useState<boolean>(true);
  const [loading, setLoading] = useState<boolean>(false);
  const [copied, setCopied] = useState<boolean>(false);

  const presets = [
    { label: 'InjectedLog.smali (Bytecode Hook)', path: 'assets/Log.smali' },
    { label: 'User Agreement (MT License)', path: 'assets/agreement.txt' },
    { label: 'JSON Syntax Parser (.mtsx)', path: 'assets/syntax/json.mtsx' },
    { label: 'Tencent Config (JSON)', path: 'assets/com.tencent.open.config.json' },
    { label: 'classes.dex (DEX 039 Header Hex)', path: 'classes.dex' },
    { label: 'Gradle App Metadata', path: 'META-INF/com/android/build/gradle/app-metadata.properties' }
  ];

  const loadFile = async (path: string) => {
    setLoading(true);
    setSelectedPreset(path);
    try {
      const res = await fetch(`/api/apk/content?path=${encodeURIComponent(path)}`);
      const data = await res.json();
      setIsText(data.isText);
      setContent(data.isText ? data.content : data.hexPreview);
    } catch (err) {
      console.error('Error loading file content:', err);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    loadFile(selectedPreset);
  }, []);

  const handleCopy = () => {
    navigator.clipboard.writeText(content);
    setCopied(true);
    setTimeout(() => setCopied(false), 2000);
  };

  return (
    <div className="flex-1 flex flex-col h-full bg-slate-950 p-4 gap-3 overflow-hidden">
      {/* Preset Selector */}
      <div className="bg-slate-900 border border-slate-800 rounded-xl p-3 flex flex-col md:flex-row md:items-center justify-between gap-3 flex-shrink-0">
        <div className="flex items-center space-x-2 overflow-x-auto">
          <span className="text-[11px] font-semibold text-slate-500 uppercase tracking-wider whitespace-nowrap">
            Featured Bytecode / Configs:
          </span>
          {presets.map((p) => (
            <button
              key={p.path}
              onClick={() => loadFile(p.path)}
              className={`text-xs px-2.5 py-1 rounded font-mono whitespace-nowrap transition border ${
                selectedPreset === p.path
                  ? 'bg-sky-950/80 border-sky-600 text-sky-300 font-semibold'
                  : 'bg-slate-950 border-slate-800 text-slate-400 hover:text-slate-200'
              }`}
            >
              {p.label}
            </button>
          ))}
        </div>

        <button
          onClick={handleCopy}
          className="flex items-center space-x-1.5 px-3 py-1 rounded bg-slate-800 hover:bg-slate-700 text-slate-200 text-xs font-medium self-end md:self-auto transition"
        >
          {copied ? <Check className="w-3.5 h-3.5 text-emerald-400" /> : <Copy className="w-3.5 h-3.5" />}
          <span>{copied ? 'Copied!' : 'Copy Code'}</span>
        </button>
      </div>

      {/* Code / Hex Editor Box */}
      <div className="flex-1 flex flex-col bg-slate-900 border border-slate-800 rounded-xl overflow-hidden shadow-lg">
        <div className="p-2.5 bg-slate-950 border-b border-slate-800 flex items-center justify-between text-xs">
          <div className="flex items-center space-x-2">
            {isText ? <FileCode className="w-4 h-4 text-sky-400" /> : <Binary className="w-4 h-4 text-indigo-400" />}
            <span className="font-mono text-slate-200 font-medium">{selectedPreset}</span>
          </div>
          <span className="text-[11px] px-2 py-0.5 rounded bg-slate-800 text-slate-400 font-mono">
            {isText ? 'UTF-8 Text / Smali' : 'Binary Hex Representation'}
          </span>
        </div>

        <div className="flex-1 overflow-auto p-4 bg-slate-950 font-mono text-xs text-slate-200 leading-relaxed">
          {loading ? (
            <div className="text-slate-500 italic">Loading file content...</div>
          ) : (
            <pre className="whitespace-pre">
              {content}
            </pre>
          )}
        </div>
      </div>
    </div>
  );
};
