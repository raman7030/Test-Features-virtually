import React from 'react';
import { 
  FolderSync, 
  Binary, 
  TerminalSquare, 
  CheckCircle2, 
  Cpu, 
  ShieldCheck, 
  Globe,
  FileCode2,
  RefreshCw,
  KeyRound,
  Skull,
  Languages,
  Code,
  BookOpen
} from 'lucide-react';

export type ActiveTab = 
  | 'explorer' 
  | 'official_web'
  | 'apk' 
  | 'signature'
  | 'killer'
  | 'localization'
  | 'syntax'
  | 'markdown'
  | 'tests' 
  | 'terminal' 
  | 'viewer';

interface NavbarProps {
  activeTab: ActiveTab;
  onTabChange: (tab: ActiveTab) => void;
  statusOnline: boolean;
  onRefresh: () => void;
}

export const Navbar: React.FC<NavbarProps> = ({
  activeTab,
  onTabChange,
  statusOnline,
  onRefresh
}) => {
  const tabs = [
    { id: 'explorer' as ActiveTab, label: 'Dual-Pane Explorer', icon: FolderSync },
    { id: 'official_web' as ActiveTab, label: 'MT Web Manager (Official)', icon: Globe },
    { id: 'apk' as ActiveTab, label: 'APK & Multi-DEX Studio', icon: Binary },
    { id: 'signature' as ActiveTab, label: 'APK Signer (TestKey)', icon: KeyRound },
    { id: 'killer' as ActiveTab, label: 'Killer Bypass Suite', icon: Skull },
    { id: 'localization' as ActiveTab, label: '12-Lang ARSC Editor', icon: Languages },
    { id: 'syntax' as ActiveTab, label: 'Syntax Lab (50+ Langs)', icon: Code },
    { id: 'markdown' as ActiveTab, label: 'KaTeX & Markdown', icon: BookOpen },
    { id: 'tests' as ActiveTab, label: 'Feature Test Suite', icon: CheckCircle2 },
    { id: 'terminal' as ActiveTab, label: 'Virtual Shell', icon: TerminalSquare },
    { id: 'viewer' as ActiveTab, label: 'Smali & Hex', icon: FileCode2 },
  ];

  return (
    <header className="bg-slate-900 border-b border-slate-800 select-none flex-shrink-0">
      {/* Top Bar */}
      <div className="flex items-center justify-between px-4 py-2 border-b border-slate-800/60">
        {/* Left: Branding & Status */}
        <div className="flex items-center space-x-3">
          <div className="flex items-center justify-center w-8 h-8 rounded-lg bg-gradient-to-tr from-sky-600 to-indigo-600 shadow-md shadow-sky-500/20 text-white font-bold text-lg">
            <Cpu className="w-4 h-4 text-white animate-pulse" />
          </div>
          <div>
            <div className="flex items-center space-x-2">
              <span className="font-bold text-slate-100 tracking-tight text-sm">
                Test Features Virtually
              </span>
              <span className="text-[10px] px-2 py-0.5 rounded-full bg-sky-950/80 border border-sky-800/80 text-sky-400 font-mono font-medium">
                MT-VirtualEnv Complete
              </span>
            </div>
            <div className="flex items-center space-x-2 text-[11px] text-slate-400">
              <span className="flex items-center space-x-1">
                <span className={`w-2 h-2 rounded-full ${statusOnline ? 'bg-emerald-500 animate-ping' : 'bg-red-500'}`} />
                <span className="text-emerald-400 font-medium">All 11 Modules Active</span>
              </span>
              <span>•</span>
              <span className="text-slate-400">Android 14 (API 34)</span>
              <span>•</span>
              <span className="text-slate-400">aarch64 / x86_64</span>
            </div>
          </div>
        </div>

        {/* Right: Quick Indicators */}
        <div className="flex items-center space-x-2">
          <div className="hidden md:flex items-center px-2 py-0.5 rounded bg-slate-800/80 border border-slate-700/60 text-[11px] text-slate-300 space-x-1.5 font-mono">
            <ShieldCheck className="w-3 h-3 text-emerald-400" />
            <span>Root Sandbox</span>
          </div>
          <button
            onClick={onRefresh}
            title="Refresh Environment State"
            className="p-1.5 rounded-md text-slate-400 hover:text-slate-200 hover:bg-slate-800 transition"
          >
            <RefreshCw className="w-3.5 h-3.5" />
          </button>
        </div>
      </div>

      {/* Tabs Navigation Strip */}
      <nav className="flex items-center px-2 py-1.5 bg-slate-950/80 overflow-x-auto gap-1">
        {tabs.map((tab) => {
          const Icon = tab.icon;
          const isActive = activeTab === tab.id;
          return (
            <button
              key={tab.id}
              onClick={() => onTabChange(tab.id)}
              className={`flex items-center space-x-1.5 px-3 py-1.5 rounded-md text-xs font-medium whitespace-nowrap transition-all ${
                isActive
                  ? 'bg-sky-600 text-white shadow-sm shadow-sky-900/50'
                  : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800/60'
              }`}
            >
              <Icon className={`w-3.5 h-3.5 ${isActive ? 'text-white' : 'text-slate-400'}`} />
              <span>{tab.label}</span>
            </button>
          );
        })}
      </nav>
    </header>
  );
};
