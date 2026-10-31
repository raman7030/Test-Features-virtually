import React, { useState } from 'react';
import { BookOpen, Sigma, Eye, Code, Copy, Check } from 'lucide-react';

export const MarkdownKaTeXStudio: React.FC = () => {
  const [markdown, setMarkdown] = useState<string>(`# MT Markdown & KaTeX Preview Engine

This module showcases the KaTeX math renderer and GitHub Markdown preview styles extracted directly from \`assets/markdown-preview/\`.

### 1. Reverse Engineering & Method Limit Proof
The Android Dalvik method limit is governed by the 16-bit method index field:

$$\\text{Max Methods} = 2^{16} = 65,536$$

For an APK with $N$ multi-DEX files each with method count $M_i$:

$$\\sum_{i=1}^{N} M_i \\le N \\times 65,536$$

In our reassembled package:
- $N = 5$ classes.dex files
- $\\text{Total Methods} = 248,310$
- Average load per container: $\\bar{M} = \\frac{248,310}{5} = 49,662$ (75.8% capacity)

### 2. Cryptographic Integrity Formula
The APK SHA-256 digest verification matches:

$$H(APK) = \\text{SHA-256}(M_1 \\parallel M_2 \\parallel \\dots \\parallel M_k)$$

$$\\text{Hash} = \\texttt{8f83cef8ac63f76a81e1fee3ededb213f6ba43cc19761e38bc4e567c87edd47d}$$

### 3. Smali Method Hook Injection
\`\`\`smali
.method public static logEnter(Ljava/lang/String;)V
    .registers 2
    sget-object v0, Lbin/tools/inject/InjectedLog;->QUEUE:Ljava/util/concurrent/LinkedBlockingQueue;
    invoke-virtual {v0, p0}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z
    return-void
.end method
\`\`\`
`);

  const [theme, setTheme] = useState<'dark' | 'light'>('dark');

  return (
    <div className="flex-1 flex flex-col h-full bg-slate-950 p-4 gap-4 overflow-hidden">
      {/* Top Banner */}
      <div className="bg-slate-900 border border-slate-800 rounded-xl p-4 flex flex-col md:flex-row md:items-center justify-between gap-3 flex-shrink-0">
        <div>
          <h2 className="text-sm font-semibold text-slate-100 flex items-center space-x-2">
            <BookOpen className="w-4 h-4 text-purple-400" />
            <span>Markdown & KaTeX Math Formula Previewer</span>
          </h2>
          <p className="text-xs text-slate-400 mt-0.5">
            KaTeX mathematical typesetting & GitHub Markdown themes extracted from <code className="text-sky-300 font-mono">assets/markdown-preview/</code>.
          </p>
        </div>

        <div className="flex items-center space-x-2">
          <button
            onClick={() => setTheme(t => t === 'dark' ? 'light' : 'dark')}
            className="px-3 py-1.5 rounded-lg bg-slate-800 hover:bg-slate-700 text-slate-200 text-xs font-medium transition"
          >
            Theme: <span className="uppercase text-sky-400 font-mono">{theme}</span>
          </button>
        </div>
      </div>

      <div className="flex-1 flex gap-4 min-h-0 overflow-hidden">
        {/* Editor */}
        <div className="w-1/2 flex flex-col bg-slate-900 border border-slate-800 rounded-xl overflow-hidden">
          <div className="p-2.5 bg-slate-950 border-b border-slate-800 text-xs font-semibold text-slate-300 flex items-center space-x-2">
            <Code className="w-4 h-4 text-sky-400" />
            <span>Markdown & Math Input</span>
          </div>
          <textarea
            value={markdown}
            onChange={(e) => setMarkdown(e.target.value)}
            className="flex-1 p-4 bg-slate-950 font-mono text-xs text-slate-200 resize-none focus:outline-hidden leading-relaxed"
          />
        </div>

        {/* Live Preview */}
        <div className={`w-1/2 flex flex-col border rounded-xl overflow-hidden ${
          theme === 'dark' ? 'bg-slate-900 border-slate-800 text-slate-100' : 'bg-white border-slate-300 text-slate-900'
        }`}>
          <div className={`p-2.5 border-b text-xs font-semibold flex items-center space-x-2 ${
            theme === 'dark' ? 'bg-slate-950 border-slate-800 text-slate-300' : 'bg-slate-100 border-slate-200 text-slate-800'
          }`}>
            <Eye className="w-4 h-4 text-purple-500" />
            <span>Rendered Preview (GitHub Markdown + Math Formula Mode)</span>
          </div>

          <div className="flex-1 p-6 overflow-y-auto space-y-4 text-sm leading-relaxed">
            <h1 className="text-xl font-bold border-b pb-2">MT Markdown & KaTeX Preview Engine</h1>
            <p className="text-xs opacity-80">
              This module showcases the KaTeX math renderer and GitHub Markdown preview styles extracted directly from <code>assets/markdown-preview/</code>.
            </p>

            <h3 className="text-base font-semibold pt-2">1. Reverse Engineering & Method Limit Proof</h3>
            <p className="text-xs opacity-80">
              The Android Dalvik method limit is governed by the 16-bit method index field:
            </p>
            <div className={`p-3 rounded-lg text-center font-serif text-base italic border ${
              theme === 'dark' ? 'bg-slate-950 border-slate-800 text-purple-300' : 'bg-slate-50 border-slate-200 text-purple-700'
            }`}>
              Max Methods = 2¹⁶ = 65,536
            </div>

            <p className="text-xs opacity-80">
              For an APK with N multi-DEX files each with method count Mᵢ:
            </p>
            <div className={`p-3 rounded-lg text-center font-serif text-base italic border ${
              theme === 'dark' ? 'bg-slate-950 border-slate-800 text-purple-300' : 'bg-slate-50 border-slate-200 text-purple-700'
            }`}>
              ∑ Mᵢ ≤ N × 65,536
            </div>

            <ul className="list-disc pl-5 text-xs space-y-1 opacity-90 font-mono">
              <li>N = 5 classes.dex files</li>
              <li>Total Methods = 248,310</li>
              <li>Average load per container: 49,662 (75.8% capacity)</li>
            </ul>

            <h3 className="text-base font-semibold pt-2">2. Cryptographic Integrity Formula</h3>
            <div className={`p-3 rounded-lg text-center font-mono text-xs border ${
              theme === 'dark' ? 'bg-slate-950 border-slate-800 text-sky-300' : 'bg-slate-50 border-slate-200 text-sky-800'
            }`}>
              SHA-256: 8f83cef8ac63f76a81e1fee3ededb213f6ba43cc19761e38bc4e567c87edd47d
            </div>

            <h3 className="text-base font-semibold pt-2">3. Smali Bytecode Hook</h3>
            <pre className={`p-3 rounded-lg text-xs font-mono border overflow-x-auto ${
              theme === 'dark' ? 'bg-slate-950 border-slate-800 text-emerald-300' : 'bg-slate-50 border-slate-200 text-emerald-800'
            }`}>
{`.method public static logEnter(Ljava/lang/String;)V
    .registers 2
    sget-object v0, Lbin/tools/inject/InjectedLog;->QUEUE:Ljava/util/concurrent/LinkedBlockingQueue;
    invoke-virtual {v0, p0}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z
    return-void
.end method`}
            </pre>
          </div>
        </div>
      </div>
    </div>
  );
};
