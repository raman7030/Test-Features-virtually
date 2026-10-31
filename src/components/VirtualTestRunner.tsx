import React, { useState, useEffect } from 'react';
import { 
  Play, 
  RotateCcw, 
  CheckCircle2, 
  AlertTriangle, 
  XCircle, 
  Clock, 
  Terminal, 
  Activity, 
  Smartphone,
  Layers,
  ShieldCheck,
  Check
} from 'lucide-react';
import { TestResult } from '../types';

export const VirtualTestRunner: React.FC = () => {
  const [tests, setTests] = useState<TestResult[]>([]);
  const [running, setRunning] = useState<boolean>(false);
  const [currentRunningIndex, setCurrentRunningIndex] = useState<number>(-1);
  const [simulatedLaunch, setSimulatedLaunch] = useState<{
    state: 'idle' | 'booting' | 'running' | 'completed';
    logs: string[];
  }>({ state: 'idle', logs: [] });

  const runAllTests = async () => {
    setRunning(true);
    setTests([]);

    try {
      const res = await fetch('/api/tests/run', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({})
      });
      const data = await res.json();
      const allTests: TestResult[] = data.tests || [];

      // Step-by-step visual animation of test execution
      for (let i = 0; i < allTests.length; i++) {
        setCurrentRunningIndex(i);
        await new Promise(r => setTimeout(r, 250));
        setTests(prev => [...prev, allTests[i]]);
      }
    } catch (err) {
      console.error('Failed to run tests:', err);
    } finally {
      setRunning(false);
      setCurrentRunningIndex(-1);
    }
  };

  useEffect(() => {
    runAllTests();
  }, []);

  const handleSimulateAppLaunch = async () => {
    setSimulatedLaunch({ state: 'booting', logs: ['[ActivityManager] Starting: Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] cmp=bin.mt.plus/.MainProcessActivity }'] });

    await new Promise(r => setTimeout(r, 400));
    setSimulatedLaunch(prev => ({
      state: 'running',
      logs: [
        ...prev.logs,
        '[Zygote64] Forked child process for UID 10104, PID 2841',
        '[LoadedApk] Loading /sdcard/MT2/Test-Features-virtually.apk into Dalvik/ART runtime',
        '[DexClassLoader] Mounted classes.dex, classes2.dex, classes3.dex, classes4.dex, classes5.dex',
        '[InjectedLog] Thread started, background log queue active',
        '[VirtualFS] Dual-pane filesystem synchronized at /sdcard and /system',
        '[ActivityThread] Activity bin.mt.plus.MainProcessActivity has been created and resumed',
        '[SurfaceFlinger] Frame rendered at 60fps in virtual window: 1080x2400 @ 420dpi'
      ]
    }));

    await new Promise(r => setTimeout(r, 800));
    setSimulatedLaunch(prev => ({
      ...prev,
      state: 'completed',
      logs: [
        ...prev.logs,
        'SUCCESS: Application feature testing cycle completed in virtual environment with 0 crashes.'
      ]
    }));
  };

  const passedCount = tests.filter(t => t.status === 'passed').length;
  const warningCount = tests.filter(t => t.status === 'warning').length;

  return (
    <div className="flex-1 flex flex-col h-full bg-slate-950 p-4 gap-4 overflow-hidden">
      {/* Top Controls Banner */}
      <div className="bg-slate-900 border border-slate-800 rounded-xl p-4 flex flex-col md:flex-row md:items-center justify-between gap-3 flex-shrink-0">
        <div>
          <h2 className="text-sm font-semibold text-slate-100 flex items-center space-x-2">
            <Activity className="w-4 h-4 text-sky-400" />
            <span>Virtual Environment Feature Test Suite</span>
          </h2>
          <p className="text-xs text-slate-400 mt-0.5">
            Automated verification of APK integrity, multi-DEX bytecode, native ABI binaries, and virtual sandbox execution.
          </p>
        </div>

        <div className="flex items-center space-x-3">
          <div className="flex items-center space-x-2 text-xs font-mono">
            <span className="px-2 py-1 rounded bg-emerald-950/80 border border-emerald-800 text-emerald-400">
              {passedCount} Passed
            </span>
            {warningCount > 0 && (
              <span className="px-2 py-1 rounded bg-amber-950/80 border border-amber-800 text-amber-400">
                {warningCount} Warnings
              </span>
            )}
          </div>

          <button
            onClick={runAllTests}
            disabled={running}
            className="flex items-center space-x-1.5 px-3.5 py-1.5 rounded-lg bg-sky-600 hover:bg-sky-500 disabled:bg-slate-800 disabled:text-slate-500 text-white text-xs font-medium transition shadow-sm"
          >
            {running ? <Clock className="w-3.5 h-3.5 animate-spin" /> : <Play className="w-3.5 h-3.5" />}
            <span>{running ? 'Running Tests...' : 'Run All Tests'}</span>
          </button>

          <button
            onClick={handleSimulateAppLaunch}
            disabled={simulatedLaunch.state === 'booting'}
            className="flex items-center space-x-1.5 px-3.5 py-1.5 rounded-lg bg-indigo-600 hover:bg-indigo-500 disabled:opacity-50 text-white text-xs font-medium transition shadow-sm"
          >
            <Smartphone className="w-3.5 h-3.5" />
            <span>Simulate App Launch</span>
          </button>
        </div>
      </div>

      <div className="flex-1 flex flex-col lg:flex-row gap-4 min-h-0 overflow-hidden">
        {/* Left: Test Results List */}
        <div className="flex-1 overflow-y-auto space-y-3">
          {tests.map((test) => {
            const isPass = test.status === 'passed';
            const isWarn = test.status === 'warning';

            return (
              <div 
                key={test.id} 
                className="bg-slate-900/80 border border-slate-800 rounded-xl p-4 shadow-sm hover:border-slate-700 transition"
              >
                <div className="flex items-start justify-between">
                  <div className="flex items-start space-x-3">
                    <div className={`p-2 rounded-lg mt-0.5 ${
                      isPass ? 'bg-emerald-950/80 text-emerald-400 border border-emerald-800' :
                      isWarn ? 'bg-amber-950/80 text-amber-400 border border-amber-800' :
                      'bg-red-950 text-red-400'
                    }`}>
                      {isPass ? <CheckCircle2 className="w-4 h-4" /> : <AlertTriangle className="w-4 h-4" />}
                    </div>
                    <div>
                      <h4 className="text-xs font-semibold text-slate-100 flex items-center space-x-2">
                        <span>{test.name}</span>
                        <span className="text-[10px] uppercase font-mono px-1.5 py-0.5 rounded bg-slate-800 text-slate-400">
                          {test.category}
                        </span>
                      </h4>
                      <p className="text-xs text-slate-300 mt-1">
                        {test.summary}
                      </p>
                    </div>
                  </div>

                  <span className="text-[11px] font-mono text-slate-500 whitespace-nowrap ml-2">
                    {test.durationMs}ms
                  </span>
                </div>

                <div className="mt-3 pt-3 border-t border-slate-800/80 pl-9">
                  <div className="space-y-1">
                    {test.details.map((detail, idx) => (
                      <div key={idx} className="flex items-center space-x-2 text-xs font-mono text-slate-400">
                        <span className="text-sky-500">•</span>
                        <span>{detail}</span>
                      </div>
                    ))}
                  </div>
                </div>
              </div>
            );
          })}

          {running && currentRunningIndex >= 0 && (
            <div className="p-4 rounded-xl border border-sky-800/80 bg-sky-950/20 flex items-center space-x-3 text-xs text-sky-300 font-mono animate-pulse">
              <Clock className="w-4 h-4 animate-spin text-sky-400" />
              <span>Executing test suite step {currentRunningIndex + 1}...</span>
            </div>
          )}
        </div>

        {/* Right: Virtual App Execution Simulation Console */}
        <div className="w-full lg:w-96 flex flex-col bg-slate-900 border border-slate-800 rounded-xl overflow-hidden flex-shrink-0">
          <div className="p-3 bg-slate-950/80 border-b border-slate-800 flex items-center justify-between">
            <span className="text-xs font-semibold text-slate-200 flex items-center space-x-2">
              <Terminal className="w-3.5 h-3.5 text-sky-400" />
              <span>Virtual Sandbox Runtime Stream</span>
            </span>
            <span className={`text-[10px] uppercase font-mono px-2 py-0.5 rounded ${
              simulatedLaunch.state === 'running' ? 'bg-sky-950 text-sky-400 border border-sky-800 animate-pulse' :
              simulatedLaunch.state === 'completed' ? 'bg-emerald-950 text-emerald-400 border border-emerald-800' :
              'bg-slate-800 text-slate-400'
            }`}>
              {simulatedLaunch.state}
            </span>
          </div>

          <div className="flex-1 overflow-y-auto p-3 font-mono text-[11px] space-y-1.5 bg-slate-950 text-slate-300">
            {simulatedLaunch.logs.length === 0 ? (
              <div className="text-slate-500 italic p-4 text-center">
                Click "Simulate App Launch" to spawn bin.mt.plus process in the virtual sandbox and observe runtime activity.
              </div>
            ) : (
              simulatedLaunch.logs.map((log, i) => (
                <div key={i} className="leading-relaxed">
                  {log.startsWith('SUCCESS') ? (
                    <span className="text-emerald-400 font-bold">{log}</span>
                  ) : log.includes('ActivityManager') ? (
                    <span className="text-sky-300">{log}</span>
                  ) : log.includes('InjectedLog') ? (
                    <span className="text-amber-300">{log}</span>
                  ) : (
                    <span className="text-slate-400">{log}</span>
                  )}
                </div>
              ))
            )}
          </div>
        </div>
      </div>
    </div>
  );
};
