import React, { useState, useEffect } from 'react';
import { Code, FileCode, Check, Copy, Search, Sparkles } from 'lucide-react';

export const SyntaxLab: React.FC = () => {
  const [syntaxes, setSyntaxes] = useState<string[]>([]);
  const [selectedSyntax, setSelectedSyntax] = useState<string>('smali');
  const [syntaxContent, setSyntaxContent] = useState<string>('');
  const [search, setSearch] = useState<string>('');
  const [copied, setCopied] = useState<boolean>(false);
  const [loading, setLoading] = useState<boolean>(false);

  useEffect(() => {
    fetch('/api/tools/syntax-list')
      .then(res => res.json())
      .then(data => {
        setSyntaxes(data.syntaxes || []);
      })
      .catch(err => console.error('Failed to load syntax list:', err));
  }, []);

  const loadSyntax = async (name: string) => {
    setSelectedSyntax(name);
    setLoading(true);
    try {
      const res = await fetch(`/api/tools/syntax-file?name=${encodeURIComponent(name)}`);
      const data = await res.json();
      setSyntaxContent(data.content || '');
    } catch (err) {
      console.error('Failed to load syntax file:', err);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    loadSyntax('smali');
  }, []);

  const handleCopy = () => {
    navigator.clipboard.writeText(syntaxContent);
    setCopied(true);
    setTimeout(() => setCopied(false), 2000);
  };

  const filtered = syntaxes.filter(s => s.toLowerCase().includes(search.toLowerCase()));

  return (
    <div className="flex-1 flex flex-col h-full bg-slate-950 p-4 gap-4 overflow-hidden">
      {/* Top Banner */}
      <div className="bg-slate-900 border border-slate-800 rounded-xl p-4 flex flex-col md:flex-row md:items-center justify-between gap-3 flex-shrink-0">
        <div>
          <h2 className="text-sm font-semibold text-slate-100 flex items-center space-x-2">
            <Code className="w-4 h-4 text-sky-400" />
            <span>Syntax Highlighting Lab (50+ Languages in .mtsx Format)</span>
          </h2>
          <p className="text-xs text-slate-400 mt-0.5">
            Full tokenizer specifications extracted from <code className="text-sky-300 font-mono">assets/syntax/*.mtsx</code> (Smali, Java, Kotlin, Rust, Python, Go, C++, Zig, Diff, etc.).
          </p>
        </div>

        <button
          onClick={handleCopy}
          className="flex items-center space-x-1.5 px-3 py-1.5 rounded-lg bg-slate-800 hover:bg-slate-700 text-slate-200 text-xs font-medium transition"
        >
          {copied ? <Check className="w-3.5 h-3.5 text-emerald-400" /> : <Copy className="w-3.5 h-3.5" />}
          <span>{copied ? 'Copied Definition' : 'Copy MTSX Code'}</span>
        </button>
      </div>

      <div className="flex-1 flex gap-4 min-h-0 overflow-hidden">
        {/* Left: Syntax List */}
        <div className="w-64 flex flex-col bg-slate-900 border border-slate-800 rounded-xl overflow-hidden flex-shrink-0">
          <div className="p-2 border-b border-slate-800">
            <input
              type="text"
              value={search}
              onChange={(e) => setSearch(e.target.value)}
              placeholder="Search 50+ languages..."
              className="w-full bg-slate-950 border border-slate-800 rounded px-2.5 py-1 text-xs text-slate-200 font-mono focus:outline-hidden focus:border-sky-500"
            />
          </div>

          <div className="flex-1 overflow-y-auto divide-y divide-slate-800/40 font-mono text-xs">
            {filtered.map(s => (
              <button
                key={s}
                onClick={() => loadSyntax(s)}
                className={`w-full text-left px-3 py-2 flex items-center justify-between transition ${
                  selectedSyntax === s
                    ? 'bg-sky-950 text-sky-300 font-bold border-l-2 border-sky-400'
                    : 'text-slate-300 hover:bg-slate-800/40'
                }`}
              >
                <span>{s}.mtsx</span>
              </button>
            ))}
          </div>
        </div>

        {/* Right: Code Definition Viewer */}
        <div className="flex-1 flex flex-col bg-slate-900 border border-slate-800 rounded-xl overflow-hidden">
          <div className="p-2.5 bg-slate-950 border-b border-slate-800 flex justify-between items-center text-xs">
            <span className="font-mono text-slate-300 font-semibold flex items-center space-x-2">
              <FileCode className="w-4 h-4 text-sky-400" />
              <span>assets/syntax/{selectedSyntax}.mtsx</span>
            </span>
            <span className="text-slate-500 font-mono">Tokenizer Definition</span>
          </div>

          <div className="flex-1 overflow-auto p-4 bg-slate-950 font-mono text-xs text-sky-200 leading-relaxed">
            {loading ? (
              <div className="text-slate-500 italic">Loading syntax definition...</div>
            ) : (
              <pre className="whitespace-pre">
                {syntaxContent}
              </pre>
            )}
          </div>
        </div>
      </div>
    </div>
  );
};
