import React, { useState, useEffect } from 'react';
import { Navbar, ActiveTab } from './components/Navbar';
import { DualPaneManager } from './components/DualPaneManager';
import { OfficialWebManager } from './components/OfficialWebManager';
import { ApkInspector } from './components/ApkInspector';
import { SignatureTool } from './components/SignatureTool';
import { KillerBypassSuite } from './components/KillerBypassSuite';
import { LocalizationEditor } from './components/LocalizationEditor';
import { SyntaxLab } from './components/SyntaxLab';
import { MarkdownKaTeXStudio } from './components/MarkdownKaTeXStudio';
import { VirtualTestRunner } from './components/VirtualTestRunner';
import { VirtualTerminal } from './components/VirtualTerminal';
import { HexViewer } from './components/HexViewer';

export function App() {
  const [activeTab, setActiveTab] = useState<ActiveTab>('explorer');
  const [statusOnline, setStatusOnline] = useState<boolean>(true);
  const [viewerPath, setViewerPath] = useState<string>('assets/Log.smali');

  const checkStatus = () => {
    fetch('/api/status')
      .then(res => res.json())
      .then(data => {
        setStatusOnline(data.status === 'ONLINE');
      })
      .catch(() => setStatusOnline(false));
  };

  useEffect(() => {
    checkStatus();
    const interval = setInterval(checkStatus, 15000);
    return () => clearInterval(interval);
  }, []);

  const handleOpenFileForInspect = (path: string) => {
    if (path.endsWith('.apk') || path.endsWith('.zip')) {
      setActiveTab('apk');
    } else {
      setViewerPath(path.replace(/^\//, ''));
      setActiveTab('viewer');
    }
  };

  return (
    <div className="flex flex-col h-screen w-screen overflow-hidden bg-slate-950 text-slate-100 font-sans antialiased">
      {/* Top Navigation Bar */}
      <Navbar
        activeTab={activeTab}
        onTabChange={setActiveTab}
        statusOnline={statusOnline}
        onRefresh={checkStatus}
      />

      {/* Main Feature Content Area */}
      <main className="flex-1 flex flex-col min-h-0 overflow-hidden">
        {activeTab === 'explorer' && (
          <DualPaneManager onOpenFileForInspect={handleOpenFileForInspect} />
        )}
        {activeTab === 'official_web' && (
          <OfficialWebManager />
        )}
        {activeTab === 'apk' && (
          <ApkInspector onViewContent={(path) => {
            setViewerPath(path);
            setActiveTab('viewer');
          }} />
        )}
        {activeTab === 'signature' && (
          <SignatureTool />
        )}
        {activeTab === 'killer' && (
          <KillerBypassSuite />
        )}
        {activeTab === 'localization' && (
          <LocalizationEditor />
        )}
        {activeTab === 'syntax' && (
          <SyntaxLab />
        )}
        {activeTab === 'markdown' && (
          <MarkdownKaTeXStudio />
        )}
        {activeTab === 'tests' && (
          <VirtualTestRunner />
        )}
        {activeTab === 'terminal' && (
          <VirtualTerminal />
        )}
        {activeTab === 'viewer' && (
          <HexViewer initialPath={viewerPath} />
        )}
      </main>
    </div>
  );
}

export default App;
