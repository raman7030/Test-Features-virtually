import React, { useState, useRef, useEffect } from 'react';
import { Terminal, Send, Trash2, Copy, Sparkles, CornerDownLeft } from 'lucide-react';
import { TerminalLog } from '../types';

export const VirtualTerminal: React.FC = () => {
  const [input, setInput] = useState<string>('');
  const [logs, setLogs] = useState<TerminalLog[]>([
    {
      id: 'init-1',
      type: 'system',
      text: 'Linux virtual-android 6.1.0-arm64-android14 #1 SMP PREEMPT Sat Oct 31 11:30:00 UTC 2026',
      timestamp: '11:30:00'
    },
    {
      id: 'init-2',
      type: 'system',
      text: 'Android 14 (API 34) Virtual Testing Environment ready. Type "help" for a list of available diagnostic commands.',
      timestamp: '11:30:01'
    }
  ]);
  const [history, setHistory] = useState<string[]>([]);
  const [historyIdx, setHistoryIdx] = useState<number>(-1);
  const [cwd, setCwd] = useState<string>('/sdcard');
  const scrollRef = useRef<HTMLDivElement>(null);

  useEffect(() => {
    if (scrollRef.current) {
      scrollRef.current.scrollTop = scrollRef.current.scrollHeight;
    }
  }, [logs]);

  const handleCommand = async (cmdStr: string) => {
    if (!cmdStr.trim()) return;

    const trimmed = cmdStr.trim();
    if (trimmed === 'clear') {
      setLogs([]);
      setInput('');
      return;
    }

    // Add command to log
    const cmdId = Date.now().toString();
    const time = new Date().toLocaleTimeString();
    setLogs(prev => [
      ...prev,
      { id: cmdId, type: 'command', text: `${cwd} # ${trimmed}`, timestamp: time }
    ]);
    setHistory(prev => [...prev, trimmed]);
    setHistoryIdx(-1);
    setInput('');

    try {
      const res = await fetch('/api/terminal/exec', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ command: trimmed, cwd })
      });
      const data = await res.json();
      
      setLogs(prev => [
        ...prev,
        {
          id: (Date.now() + 1).toString(),
          type: 'output',
          text: data.output || '',
          timestamp: data.timestamp || time
        }
      ]);
    } catch (err: any) {
      setLogs(prev => [
        ...prev,
        {
          id: (Date.now() + 1).toString(),
          type: 'error',
          text: `Command error: ${err.message}`,
          timestamp: time
        }
      ]);
    }
  };

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    handleCommand(input);
  };

  const handleKeyDown = (e: React.KeyboardEvent<HTMLInputElement>) => {
    if (e.key === 'ArrowUp') {
      e.preventDefault();
      if (history.length === 0) return;
      const nextIdx = historyIdx < 0 ? history.length - 1 : Math.max(0, historyIdx - 1);
      setHistoryIdx(nextIdx);
      setInput(history[nextIdx]);
    } else if (e.key === 'ArrowDown') {
      e.preventDefault();
      if (historyIdx >= 0) {
        const nextIdx = historyIdx + 1;
        if (nextIdx < history.length) {
          setHistoryIdx(nextIdx);
          setInput(history[nextIdx]);
        } else {
          setHistoryIdx(-1);
          setInput('');
        }
      }
    }
  };

  const quickCommands = [
    { label: 'help', cmd: 'help' },
    { label: 'pm list packages', cmd: 'pm list packages' },
    { label: 'pm dump bin.mt.plus', cmd: 'pm dump bin.mt.plus' },
    { label: 'dexdump -f classes.dex', cmd: 'dexdump -f classes.dex' },
    { label: 'getprop', cmd: 'getprop' },
    { label: 'logcat', cmd: 'logcat' },
    { label: 'ls -l /sdcard', cmd: 'ls -l /sdcard' },
    { label: 'df -h', cmd: 'df -h' },
    { label: 'ps', cmd: 'ps' },
    { label: 'whoami', cmd: 'whoami' },
  ];

  return (
    <div className="flex-1 flex flex-col h-full bg-slate-950 p-4 gap-3 overflow-hidden">
      {/* Quick Commands Bar */}
      <div className="flex items-center space-x-2 overflow-x-auto pb-1 flex-shrink-0">
        <span className="text-[11px] font-semibold text-slate-500 uppercase tracking-wider whitespace-nowrap">
          Quick Diagnostics:
        </span>
        {quickCommands.map((q) => (
          <button
            key={q.cmd}
            onClick={() => handleCommand(q.cmd)}
            className="text-xs px-2.5 py-1 rounded bg-slate-900 hover:bg-slate-800 border border-slate-800 text-sky-400 font-mono whitespace-nowrap transition"
          >
            {q.label}
          </button>
        ))}
      </div>

      {/* Terminal Window */}
      <div className="flex-1 flex flex-col bg-slate-900 border border-slate-800 rounded-xl overflow-hidden shadow-xl">
        {/* Terminal Header */}
        <div className="p-2.5 bg-slate-950 border-b border-slate-800 flex items-center justify-between text-xs text-slate-400">
          <div className="flex items-center space-x-2">
            <span className="w-2.5 h-2.5 rounded-full bg-red-500/80" />
            <span className="w-2.5 h-2.5 rounded-full bg-amber-500/80" />
            <span className="w-2.5 h-2.5 rounded-full bg-emerald-500/80" />
            <span className="ml-2 font-mono text-slate-300">root@virtual-pixel7: {cwd}</span>
          </div>

          <div className="flex items-center space-x-2">
            <button
              onClick={() => setLogs([])}
              title="Clear terminal"
              className="p-1 rounded text-slate-400 hover:text-slate-200 hover:bg-slate-800"
            >
              <Trash2 className="w-3.5 h-3.5" />
            </button>
          </div>
        </div>

        {/* Terminal Logs Output */}
        <div 
          ref={scrollRef}
          className="flex-1 p-3 overflow-y-auto font-mono text-xs space-y-2 bg-slate-950/90 text-slate-200"
        >
          {logs.map((log) => {
            if (log.type === 'command') {
              return (
                <div key={log.id} className="text-sky-400 font-bold flex items-center space-x-2">
                  <span className="text-emerald-400">#</span>
                  <span>{log.text}</span>
                </div>
              );
            }
            if (log.type === 'system') {
              return (
                <div key={log.id} className="text-slate-500 italic">
                  {log.text}
                </div>
              );
            }
            if (log.type === 'error') {
              return (
                <div key={log.id} className="text-red-400">
                  {log.text}
                </div>
              );
            }
            return (
              <pre key={log.id} className="text-slate-300 whitespace-pre-wrap font-mono leading-relaxed pl-2 border-l border-slate-800">
                {log.text}
              </pre>
            );
          })}
        </div>

        {/* Command Input Prompt */}
        <form onSubmit={handleSubmit} className="p-2.5 bg-slate-950 border-t border-slate-800 flex items-center space-x-2">
          <span className="font-mono text-xs text-emerald-400 font-bold">{cwd} #</span>
          <input
            type="text"
            value={input}
            onChange={(e) => setInput(e.target.value)}
            onKeyDown={handleKeyDown}
            placeholder="Enter shell command (try 'getprop', 'dexdump', 'pm list packages', 'help')..."
            className="flex-1 bg-transparent border-0 text-xs font-mono text-slate-100 focus:outline-hidden placeholder-slate-600"
            autoFocus
          />
          <button
            type="submit"
            className="px-2.5 py-1 rounded bg-sky-600 hover:bg-sky-500 text-white text-xs flex items-center space-x-1"
          >
            <Send className="w-3 h-3" />
          </button>
        </form>
      </div>
    </div>
  );
};
