import React, { useState, useEffect } from 'react';
import { 
  Folder, 
  File, 
  FileCode, 
  FileArchive, 
  Copy, 
  ArrowRightLeft, 
  Trash2, 
  Plus, 
  FolderPlus, 
  Eye, 
  ChevronRight,
  HardDrive,
  RefreshCw,
  Search,
  CheckSquare,
  Square
} from 'lucide-react';
import { VfsNode } from '../types';

interface DualPaneManagerProps {
  onOpenFileForInspect?: (path: string) => void;
}

export const DualPaneManager: React.FC<DualPaneManagerProps> = ({ onOpenFileForInspect }) => {
  // Left pane state
  const [leftPath, setLeftPath] = useState<string>('/sdcard');
  const [leftItems, setLeftItems] = useState<VfsNode[]>([]);
  const [leftSelected, setLeftSelected] = useState<string | null>(null);

  // Right pane state
  const [rightPath, setRightPath] = useState<string>('/system');
  const [rightItems, setRightItems] = useState<VfsNode[]>([]);
  const [rightSelected, setRightSelected] = useState<string | null>(null);

  // Active focused pane: 'left' | 'right'
  const [activePane, setActivePane] = useState<'left' | 'right'>('left');

  // Modals / Dialogs
  const [newDialog, setNewDialog] = useState<{ open: boolean; type: 'folder' | 'file'; pane: 'left' | 'right' }>({
    open: false,
    type: 'folder',
    pane: 'left'
  });
  const [newItemName, setNewItemName] = useState<string>('');

  const loadPane = async (path: string, pane: 'left' | 'right') => {
    try {
      const res = await fetch(`/api/vfs/list?path=${encodeURIComponent(path)}`);
      const data = await res.json();
      if (pane === 'left') {
        setLeftItems(data.items || []);
        setLeftSelected(null);
      } else {
        setRightItems(data.items || []);
        setRightSelected(null);
      }
    } catch (err) {
      console.error(`Failed to load ${pane} pane:`, err);
    }
  };

  useEffect(() => {
    loadPane(leftPath, 'left');
  }, [leftPath]);

  useEffect(() => {
    loadPane(rightPath, 'right');
  }, [rightPath]);

  const handleNavigate = (targetPath: string, pane: 'left' | 'right') => {
    if (pane === 'left') setLeftPath(targetPath);
    else setRightPath(targetPath);
  };

  const handleItemClick = (item: VfsNode, pane: 'left' | 'right') => {
    setActivePane(pane);
    if (pane === 'left') {
      setLeftSelected(item.name);
    } else {
      setRightSelected(item.name);
    }
  };

  const handleItemDoubleClick = (item: VfsNode, pane: 'left' | 'right') => {
    const current = pane === 'left' ? leftPath : rightPath;
    if (item.type === 'directory') {
      const nextPath = current === '/' ? `/${item.name}` : `${current}/${item.name}`;
      handleNavigate(nextPath, pane);
    } else {
      if (item.name.endsWith('.apk') || item.name.endsWith('.zip')) {
        if (onOpenFileForInspect) onOpenFileForInspect(`${current}/${item.name}`);
      } else if (onOpenFileForInspect) {
        onOpenFileForInspect(`${current}/${item.name}`);
      }
    }
  };

  const handleAction = async (action: 'copy' | 'delete') => {
    const isLeft = activePane === 'left';
    const currentPath = isLeft ? leftPath : rightPath;
    const selected = isLeft ? leftSelected : rightSelected;
    const destPath = isLeft ? rightPath : leftPath;

    if (!selected) return;

    if (action === 'delete') {
      if (!confirm(`Are you sure you want to delete ${selected}?`)) return;
      await fetch('/api/vfs/action', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ action: 'delete', currentPath, targetName: selected })
      });
      loadPane(currentPath, activePane);
    } else if (action === 'copy') {
      await fetch('/api/vfs/action', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ action: 'copy', currentPath, targetName: selected, destinationPath: destPath })
      });
      loadPane(destPath, isLeft ? 'right' : 'left');
    }
  };

  const handleCreateSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    if (!newItemName.trim()) return;

    const targetPane = newDialog.pane;
    const currentPath = targetPane === 'left' ? leftPath : rightPath;

    await fetch('/api/vfs/action', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({
        action: newDialog.type === 'folder' ? 'create_folder' : 'create_file',
        currentPath,
        targetName: newItemName.trim(),
        content: newDialog.type === 'file' ? '# Virtual Test Script\n' : ''
      })
    });

    setNewDialog({ open: false, type: 'folder', pane: 'left' });
    setNewItemName('');
    loadPane(currentPath, targetPane);
  };

  const renderBreadcrumb = (currentPath: string, pane: 'left' | 'right') => {
    const segments = currentPath.split('/').filter(Boolean);
    return (
      <div className="flex items-center space-x-1 text-xs text-slate-300 overflow-x-auto py-1 px-2 bg-slate-900/80 rounded border border-slate-800">
        <button
          onClick={() => handleNavigate('/', pane)}
          className="text-slate-400 hover:text-sky-400 font-mono px-1 rounded hover:bg-slate-800"
        >
          /
        </button>
        {segments.map((seg, idx) => {
          const segPath = '/' + segments.slice(0, idx + 1).join('/');
          const isLast = idx === segments.length - 1;
          return (
            <React.Fragment key={segPath}>
              <ChevronRight className="w-3 h-3 text-slate-600 flex-shrink-0" />
              <button
                onClick={() => handleNavigate(segPath, pane)}
                className={`font-mono px-1 rounded transition-colors ${
                  isLast ? 'text-sky-400 font-semibold' : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800'
                }`}
              >
                {seg}
              </button>
            </React.Fragment>
          );
        })}
      </div>
    );
  };

  const renderPane = (
    title: string,
    currentPath: string,
    items: VfsNode[],
    selected: string | null,
    pane: 'left' | 'right'
  ) => {
    const isActive = activePane === pane;
    const parentPath = currentPath === '/' ? '/' : currentPath.split('/').slice(0, -1).join('/') || '/';

    return (
      <div 
        onClick={() => setActivePane(pane)}
        className={`flex-1 flex flex-col bg-slate-900/40 rounded-xl border transition-all overflow-hidden ${
          isActive 
            ? 'border-sky-500/60 shadow-lg shadow-sky-950/20 ring-1 ring-sky-500/20' 
            : 'border-slate-800/80 hover:border-slate-700'
        }`}
      >
        {/* Pane Header */}
        <div className="p-2.5 bg-slate-900/90 border-b border-slate-800 flex flex-col space-y-2">
          <div className="flex items-center justify-between">
            <div className="flex items-center space-x-2">
              <span className={`w-2 h-2 rounded-full ${isActive ? 'bg-sky-400' : 'bg-slate-600'}`} />
              <span className="text-xs font-semibold uppercase tracking-wider text-slate-300">
                {title}
              </span>
              <span className="text-[11px] text-slate-500 font-mono">({items.length} items)</span>
            </div>
            
            {/* Quick folder shortcuts */}
            <div className="flex items-center space-x-1">
              <button
                onClick={() => handleNavigate('/sdcard', pane)}
                className="text-[11px] px-2 py-0.5 rounded bg-slate-800 hover:bg-slate-700 text-slate-300 font-mono"
              >
                /sdcard
              </button>
              <button
                onClick={() => handleNavigate('/sdcard/MT2', pane)}
                className="text-[11px] px-2 py-0.5 rounded bg-slate-800 hover:bg-slate-700 text-slate-300 font-mono"
              >
                /MT2
              </button>
              <button
                onClick={() => handleNavigate('/system', pane)}
                className="text-[11px] px-2 py-0.5 rounded bg-slate-800 hover:bg-slate-700 text-slate-300 font-mono"
              >
                /system
              </button>
              <button
                onClick={() => loadPane(currentPath, pane)}
                title="Reload"
                className="p-1 rounded text-slate-400 hover:text-slate-200 hover:bg-slate-800"
              >
                <RefreshCw className="w-3.5 h-3.5" />
              </button>
            </div>
          </div>

          {/* Breadcrumb Path */}
          {renderBreadcrumb(currentPath, pane)}
        </div>

        {/* File Table */}
        <div className="flex-1 overflow-y-auto">
          <table className="w-full text-left text-xs border-collapse">
            <thead className="bg-slate-950/60 sticky top-0 border-b border-slate-800/80 text-[11px] text-slate-400 uppercase tracking-wider">
              <tr>
                <th className="py-1.5 px-3">Name</th>
                <th className="py-1.5 px-3 text-right">Size</th>
                <th className="py-1.5 px-3 text-right">Permissions</th>
                <th className="py-1.5 px-3 text-right">Date</th>
              </tr>
            </thead>
            <tbody className="divide-y divide-slate-800/40 font-mono">
              {/* Back to Parent Directory row */}
              {currentPath !== '/' && (
                <tr
                  onDoubleClick={() => handleNavigate(parentPath, pane)}
                  className="hover:bg-slate-800/50 cursor-pointer text-slate-400"
                >
                  <td colSpan={4} className="py-1.5 px-3 flex items-center space-x-2">
                    <Folder className="w-4 h-4 text-amber-500 fill-amber-500/20" />
                    <span>.. (Parent Directory)</span>
                  </td>
                </tr>
              )}

              {items.map((item) => {
                const isSelected = selected === item.name;
                const isDir = item.type === 'directory';
                const isApk = item.name.endsWith('.apk');
                const isCode = item.name.endsWith('.cfg') || item.name.endsWith('.txt') || item.name.endsWith('.json') || item.name.endsWith('.prop');

                return (
                  <tr
                    key={item.name}
                    onClick={() => handleItemClick(item, pane)}
                    onDoubleClick={() => handleItemDoubleClick(item, pane)}
                    className={`cursor-pointer transition-colors ${
                      isSelected
                        ? 'bg-sky-950/80 text-sky-200 border-l-2 border-sky-400'
                        : 'hover:bg-slate-800/40 text-slate-300'
                    }`}
                  >
                    <td className="py-1.5 px-3 flex items-center space-x-2">
                      {isDir ? (
                        <Folder className="w-4 h-4 text-amber-400 fill-amber-400/20 flex-shrink-0" />
                      ) : isApk ? (
                        <FileArchive className="w-4 h-4 text-emerald-400 flex-shrink-0" />
                      ) : isCode ? (
                        <FileCode className="w-4 h-4 text-sky-400 flex-shrink-0" />
                      ) : (
                        <File className="w-4 h-4 text-slate-400 flex-shrink-0" />
                      )}
                      <span className={`truncate ${isDir ? 'font-semibold text-slate-200' : ''}`}>
                        {item.name}
                      </span>
                    </td>
                    <td className="py-1.5 px-3 text-right text-slate-400">
                      {isDir ? 'DIR' : formatFileSize(item.size)}
                    </td>
                    <td className="py-1.5 px-3 text-right text-slate-500">
                      {item.permissions}
                    </td>
                    <td className="py-1.5 px-3 text-right text-slate-400">
                      {item.updatedAt}
                    </td>
                  </tr>
                );
              })}

              {items.length === 0 && (
                <tr>
                  <td colSpan={4} className="py-8 text-center text-slate-500 italic">
                    Empty folder
                  </td>
                </tr>
              )}
            </tbody>
          </table>
        </div>
      </div>
    );
  };

  const activeSelected = activePane === 'left' ? leftSelected : rightSelected;

  return (
    <div className="flex-1 flex flex-col h-full p-3 gap-3 overflow-hidden bg-slate-950">
      {/* Top Action Toolbar */}
      <div className="bg-slate-900 border border-slate-800 rounded-lg p-2 flex items-center justify-between shadow-sm">
        <div className="flex items-center space-x-2">
          <button
            onClick={() => handleAction('copy')}
            disabled={!activeSelected}
            className="flex items-center space-x-1.5 px-3 py-1.5 rounded bg-sky-600 hover:bg-sky-500 disabled:bg-slate-800 disabled:text-slate-500 text-white text-xs font-medium transition"
          >
            <Copy className="w-3.5 h-3.5" />
            <span>Copy to {activePane === 'left' ? 'Right' : 'Left'}</span>
          </button>
          
          <button
            onClick={() => handleAction('delete')}
            disabled={!activeSelected}
            className="flex items-center space-x-1.5 px-3 py-1.5 rounded bg-red-950/80 hover:bg-red-900/80 border border-red-800/80 text-red-300 disabled:opacity-40 text-xs font-medium transition"
          >
            <Trash2 className="w-3.5 h-3.5" />
            <span>Delete</span>
          </button>

          <button
            onClick={() => setNewDialog({ open: true, type: 'folder', pane: activePane })}
            className="flex items-center space-x-1.5 px-3 py-1.5 rounded bg-slate-800 hover:bg-slate-700 text-slate-200 text-xs font-medium transition"
          >
            <FolderPlus className="w-3.5 h-3.5 text-amber-400" />
            <span>New Folder</span>
          </button>

          <button
            onClick={() => setNewDialog({ open: true, type: 'file', pane: activePane })}
            className="flex items-center space-x-1.5 px-3 py-1.5 rounded bg-slate-800 hover:bg-slate-700 text-slate-200 text-xs font-medium transition"
          >
            <Plus className="w-3.5 h-3.5 text-sky-400" />
            <span>New File</span>
          </button>

          {activeSelected && onOpenFileForInspect && (
            <button
              onClick={() => {
                const current = activePane === 'left' ? leftPath : rightPath;
                onOpenFileForInspect(`${current}/${activeSelected}`);
              }}
              className="flex items-center space-x-1.5 px-3 py-1.5 rounded bg-indigo-950/80 border border-indigo-800/80 text-indigo-300 hover:bg-indigo-900/80 text-xs font-medium transition"
            >
              <Eye className="w-3.5 h-3.5" />
              <span>Inspect / View</span>
            </button>
          )}
        </div>

        <div className="flex items-center text-xs text-slate-400 space-x-3">
          <span>Active Pane: <strong className="text-sky-400 uppercase">{activePane}</strong></span>
          <span>Selected: <span className="font-mono text-slate-200">{activeSelected || 'None'}</span></span>
        </div>
      </div>

      {/* Dual Pane Container */}
      <div className="flex-1 flex gap-3 min-h-0">
        {renderPane('Left Explorer (SDCARD / User Storage)', leftPath, leftItems, leftSelected, 'left')}
        {renderPane('Right Explorer (System / Root Directory)', rightPath, rightItems, rightSelected, 'right')}
      </div>

      {/* Modal Dialog for New Folder / File */}
      {newDialog.open && (
        <div className="fixed inset-0 bg-black/60 backdrop-blur-xs flex items-center justify-center p-4 z-50">
          <form 
            onSubmit={handleCreateSubmit}
            className="bg-slate-900 border border-slate-800 rounded-xl max-w-sm w-full p-4 shadow-xl space-y-4"
          >
            <h3 className="text-sm font-semibold text-slate-100 flex items-center space-x-2">
              {newDialog.type === 'folder' ? <FolderPlus className="w-4 h-4 text-amber-400" /> : <Plus className="w-4 h-4 text-sky-400" />}
              <span>Create New {newDialog.type === 'folder' ? 'Folder' : 'File'} in {newDialog.pane === 'left' ? leftPath : rightPath}</span>
            </h3>
            <div>
              <label className="block text-xs text-slate-400 mb-1">Name</label>
              <input
                autoFocus
                type="text"
                value={newItemName}
                onChange={(e) => setNewItemName(e.target.value)}
                placeholder={newDialog.type === 'folder' ? 'my_folder' : 'script.sh'}
                className="w-full bg-slate-950 border border-slate-700 rounded-md px-3 py-1.5 text-xs text-slate-100 focus:outline-hidden focus:border-sky-500 font-mono"
              />
            </div>
            <div className="flex justify-end space-x-2">
              <button
                type="button"
                onClick={() => setNewDialog({ open: false, type: 'folder', pane: 'left' })}
                className="px-3 py-1.5 rounded bg-slate-800 hover:bg-slate-700 text-slate-300 text-xs"
              >
                Cancel
              </button>
              <button
                type="submit"
                className="px-3 py-1.5 rounded bg-sky-600 hover:bg-sky-500 text-white text-xs font-medium"
              >
                Create
              </button>
            </div>
          </form>
        </div>
      )}
    </div>
  );
};

function formatFileSize(bytes: number): string {
  if (bytes === 0) return '0 B';
  const k = 1024;
  const sizes = ['B', 'KB', 'MB', 'GB'];
  const i = Math.floor(Math.log(bytes) / Math.log(k));
  return parseFloat((bytes / Math.pow(k, i)).toFixed(1)) + ' ' + sizes[i];
}
