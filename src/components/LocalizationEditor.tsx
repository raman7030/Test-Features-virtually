import React, { useState, useEffect } from 'react';
import { Languages, Search, Edit3, Check, Globe2, FileText, ArrowRight } from 'lucide-react';

export const LocalizationEditor: React.FC = () => {
  const [data, setData] = useState<{ availableLanguages: string[]; translations: Record<string, Record<string, string>> }>({
    availableLanguages: [],
    translations: {}
  });
  const [sourceLang, setSourceLang] = useState<string>('zh-CN');
  const [targetLang, setTargetLang] = useState<string>('es');
  const [search, setSearch] = useState<string>('');

  useEffect(() => {
    fetch('/api/tools/languages')
      .then(res => res.json())
      .then(resData => {
        setData(resData);
        if (resData.availableLanguages.includes('zh-CN')) setSourceLang('zh-CN');
        if (resData.availableLanguages.includes('es')) setTargetLang('es');
      })
      .catch(err => console.error('Failed to load translations:', err));
  }, []);

  const sourceDict = data.translations[sourceLang] || {};
  const targetDict = data.translations[targetLang] || {};

  const allKeys = Array.from(new Set([...Object.keys(sourceDict), ...Object.keys(targetDict)]));
  const filteredKeys = allKeys.filter(k => 
    k.toLowerCase().includes(search.toLowerCase()) ||
    (sourceDict[k] || '').toLowerCase().includes(search.toLowerCase()) ||
    (targetDict[k] || '').toLowerCase().includes(search.toLowerCase())
  );

  return (
    <div className="flex-1 flex flex-col h-full bg-slate-950 p-4 gap-4 overflow-hidden">
      {/* Top Controls */}
      <div className="bg-slate-900 border border-slate-800 rounded-xl p-4 flex flex-col md:flex-row md:items-center justify-between gap-3 flex-shrink-0">
        <div>
          <h2 className="text-sm font-semibold text-slate-100 flex items-center space-x-2">
            <Languages className="w-4 h-4 text-sky-400" />
            <span>ARSC & Multi-Language Localization Editor (12 Languages)</span>
          </h2>
          <p className="text-xs text-slate-400 mt-0.5">
            Resource string dictionaries extracted from <code className="text-sky-300 font-mono">assets/lang-*.mtl</code> supporting Chinese, Spanish, Russian, Italian, Turkish, Ukrainian, etc.
          </p>
        </div>

        <div className="flex items-center space-x-3">
          <div className="flex items-center space-x-1 text-xs">
            <span className="text-slate-400">Source:</span>
            <select
              value={sourceLang}
              onChange={(e) => setSourceLang(e.target.value)}
              className="bg-slate-950 border border-slate-800 rounded px-2 py-1 text-slate-200 font-mono text-xs"
            >
              {data.availableLanguages.map(l => (
                <option key={l} value={l}>{l}</option>
              ))}
            </select>
          </div>

          <ArrowRight className="w-3.5 h-3.5 text-slate-500" />

          <div className="flex items-center space-x-1 text-xs">
            <span className="text-slate-400">Target:</span>
            <select
              value={targetLang}
              onChange={(e) => setTargetLang(e.target.value)}
              className="bg-slate-950 border border-slate-800 rounded px-2 py-1 text-slate-200 font-mono text-xs"
            >
              {data.availableLanguages.map(l => (
                <option key={l} value={l}>{l}</option>
              ))}
            </select>
          </div>
        </div>
      </div>

      {/* Search Bar */}
      <div className="relative flex-shrink-0">
        <Search className="w-3.5 h-3.5 text-slate-500 absolute left-3 top-3" />
        <input
          type="text"
          value={search}
          onChange={(e) => setSearch(e.target.value)}
          placeholder="Filter translation keys or strings..."
          className="w-full bg-slate-900 border border-slate-800 rounded-lg pl-9 pr-4 py-2 text-xs text-slate-200 focus:outline-hidden focus:border-sky-500 font-mono"
        />
      </div>

      {/* Translations Table */}
      <div className="flex-1 bg-slate-900 border border-slate-800 rounded-xl overflow-hidden flex flex-col min-h-0">
        <div className="p-2.5 bg-slate-950 border-b border-slate-800 grid grid-cols-12 text-[11px] font-semibold text-slate-400 uppercase tracking-wider">
          <div className="col-span-3">Key Identifier</div>
          <div className="col-span-4">Source ({sourceLang})</div>
          <div className="col-span-5">Target ({targetLang})</div>
        </div>

        <div className="flex-1 overflow-y-auto divide-y divide-slate-800/40 text-xs font-mono">
          {filteredKeys.map(k => {
            const sVal = sourceDict[k] || '';
            const tVal = targetDict[k] || '';
            return (
              <div key={k} className="p-2.5 grid grid-cols-12 items-center hover:bg-slate-800/30 transition">
                <div className="col-span-3 text-sky-400 font-semibold truncate pr-2" title={k}>
                  {k}
                </div>
                <div className="col-span-4 text-slate-300 pr-2 truncate" title={sVal}>
                  {sVal || <span className="text-slate-600 italic">Not defined</span>}
                </div>
                <div className="col-span-5 text-emerald-300 truncate" title={tVal}>
                  {tVal || <span className="text-amber-500 italic">Missing translation</span>}
                </div>
              </div>
            );
          })}

          {filteredKeys.length === 0 && (
            <div className="p-8 text-center text-slate-500 italic">
              No matching translation keys found.
            </div>
          )}
        </div>
      </div>
    </div>
  );
};
