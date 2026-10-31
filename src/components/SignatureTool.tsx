import React, { useState, useEffect } from 'react';
import { KeyRound, ShieldCheck, CheckCircle2, FileSignature, AlertCircle, Copy, Check, Play } from 'lucide-react';

export const SignatureTool: React.FC = () => {
  const [certData, setCertData] = useState<any>(null);
  const [targetPackage, setTargetPackage] = useState<string>('bin.mt.plus');
  const [signingScheme, setSigningScheme] = useState<{ v1: boolean; v2: boolean; v3: boolean }>({
    v1: true,
    v2: true,
    v3: true
  });
  const [signingStatus, setSigningStatus] = useState<'idle' | 'signing' | 'success'>('idle');
  const [signingLog, setSigningLog] = useState<string[]>([]);
  const [copied, setCopied] = useState<boolean>(false);

  useEffect(() => {
    fetch('/api/tools/certificate')
      .then(res => res.json())
      .then(data => setCertData(data))
      .catch(err => console.error('Failed to load certificate:', err));
  }, []);

  const handleSign = async () => {
    setSigningStatus('signing');
    setSigningLog(['[ApkSigner] Reading testkey.x509.pem and testkey.pk8 private key...']);

    await new Promise(r => setTimeout(r, 400));
    setSigningLog(prev => [
      ...prev,
      `[ApkSigner] Parsing APK archive for target package: ${targetPackage}`,
      '[Digest] Calculating SHA-1 & SHA-256 for 2,261 zip central directory entries',
      '[Digest] Entry classes.dex: SHA-256 verified',
      '[Digest] Entry classes2.dex: SHA-256 verified',
      '[Digest] Entry classes3.dex: SHA-256 verified',
      '[Digest] Entry classes4.dex: SHA-256 verified',
      '[Digest] Entry classes5.dex: SHA-256 verified'
    ]);

    await new Promise(r => setTimeout(r, 500));
    setSigningLog(prev => [
      ...prev,
      signingScheme.v1 ? '[v1 JAR Signature] Created META-INF/MANIFEST.MF, CERT.SF, and CERT.RSA' : '[v1 JAR Signature] Skipped',
      signingScheme.v2 ? '[v2 APK Scheme] Embedded APK Signing Block ID 0x7109871a (2048-bit RSA signature)' : '[v2 APK Scheme] Skipped',
      signingScheme.v3 ? '[v3 APK Scheme] Embedded APK Signing Block ID 0xf05368c0 (Proof of rotation capabilities)' : '[v3 APK Scheme] Skipped',
      `SUCCESS: Signed ${targetPackage}.apk successfully! Verification passes on Android 5.0 - Android 14+`
    ]);
    setSigningStatus('success');
  };

  const copyCert = () => {
    if (certData?.pemContent) {
      navigator.clipboard.writeText(certData.pemContent);
      setCopied(true);
      setTimeout(() => setCopied(false), 2000);
    }
  };

  return (
    <div className="flex-1 flex flex-col h-full bg-slate-950 p-4 gap-4 overflow-hidden">
      {/* Top Banner */}
      <div className="bg-slate-900 border border-slate-800 rounded-xl p-4 flex flex-col md:flex-row md:items-center justify-between gap-3 flex-shrink-0">
        <div>
          <h2 className="text-sm font-semibold text-slate-100 flex items-center space-x-2">
            <KeyRound className="w-4 h-4 text-amber-400" />
            <span>APK Signing & Certificate Manager (testkey.pk8 / testkey.x509.pem)</span>
          </h2>
          <p className="text-xs text-slate-400 mt-0.5">
            Cryptographic signing keys extracted from <code className="text-sky-300 font-mono">assets/testkey.*</code> in the repository APK for virtual re-signing and integrity testing.
          </p>
        </div>

        <button
          onClick={handleSign}
          disabled={signingStatus === 'signing'}
          className="flex items-center space-x-1.5 px-4 py-2 rounded-lg bg-amber-600 hover:bg-amber-500 disabled:bg-slate-800 text-white text-xs font-semibold shadow-md transition"
        >
          <FileSignature className="w-4 h-4" />
          <span>{signingStatus === 'signing' ? 'Signing APK...' : 'Sign Target APK'}</span>
        </button>
      </div>

      <div className="flex-1 flex flex-col lg:flex-row gap-4 min-h-0 overflow-hidden">
        {/* Left: Certificate Details */}
        <div className="flex-1 flex flex-col bg-slate-900 border border-slate-800 rounded-xl overflow-hidden p-4 space-y-4 overflow-y-auto">
          <div className="flex items-center justify-between border-b border-slate-800 pb-2">
            <span className="text-xs font-bold uppercase tracking-wider text-slate-300 flex items-center space-x-2">
              <ShieldCheck className="w-4 h-4 text-emerald-400" />
              <span>AOSP TestKey Certificate Details</span>
            </span>
            <button
              onClick={copyCert}
              className="flex items-center space-x-1 text-xs text-slate-400 hover:text-slate-200"
            >
              {copied ? <Check className="w-3.5 h-3.5 text-emerald-400" /> : <Copy className="w-3.5 h-3.5" />}
              <span>{copied ? 'Copied' : 'Copy PEM'}</span>
            </button>
          </div>

          {certData ? (
            <div className="space-y-3 font-mono text-xs">
              <div className="p-2.5 rounded-lg bg-slate-950 border border-slate-800">
                <span className="text-slate-500 block text-[10px] uppercase">Subject & Issuer</span>
                <span className="text-sky-300 font-semibold">{certData.subject}</span>
              </div>

              <div className="grid grid-cols-2 gap-2">
                <div className="p-2.5 rounded-lg bg-slate-950 border border-slate-800">
                  <span className="text-slate-500 block text-[10px] uppercase">Key Algorithm</span>
                  <span className="text-slate-200">{certData.publicKey}</span>
                </div>
                <div className="p-2.5 rounded-lg bg-slate-950 border border-slate-800">
                  <span className="text-slate-500 block text-[10px] uppercase">Sig Algorithm</span>
                  <span className="text-slate-200">{certData.signatureAlgorithm}</span>
                </div>
              </div>

              <div className="grid grid-cols-2 gap-2">
                <div className="p-2.5 rounded-lg bg-slate-950 border border-slate-800">
                  <span className="text-slate-500 block text-[10px] uppercase">Valid From</span>
                  <span className="text-slate-300">{certData.validFrom}</span>
                </div>
                <div className="p-2.5 rounded-lg bg-slate-950 border border-slate-800">
                  <span className="text-slate-500 block text-[10px] uppercase">Valid Until</span>
                  <span className="text-emerald-400 font-semibold">{certData.validUntil}</span>
                </div>
              </div>

              <div className="p-2.5 rounded-lg bg-slate-950 border border-slate-800">
                <span className="text-slate-500 block text-[10px] uppercase">SHA-256 Fingerprint</span>
                <span className="text-amber-300 text-[11px] break-all">{certData.fingerprintSha256}</span>
              </div>

              <div className="p-2.5 rounded-lg bg-slate-950 border border-slate-800">
                <span className="text-slate-500 block text-[10px] uppercase">SHA-1 Fingerprint</span>
                <span className="text-slate-300 text-[11px] break-all">{certData.fingerprintSha1}</span>
              </div>
            </div>
          ) : (
            <div className="text-slate-500 italic p-4">Loading certificate information...</div>
          )}
        </div>

        {/* Right: Signature Execution & Schemes */}
        <div className="w-full lg:w-1/2 flex flex-col bg-slate-900 border border-slate-800 rounded-xl overflow-hidden p-4 space-y-4">
          <span className="text-xs font-bold uppercase tracking-wider text-slate-300 border-b border-slate-800 pb-2">
            Signature Configuration & Simulator
          </span>

          <div className="space-y-3 text-xs">
            <div>
              <label className="text-slate-400 block mb-1">Target Package</label>
              <input
                type="text"
                value={targetPackage}
                onChange={(e) => setTargetPackage(e.target.value)}
                className="w-full bg-slate-950 border border-slate-800 rounded px-3 py-1.5 font-mono text-slate-100 text-xs"
              />
            </div>

            <div className="space-y-2 pt-1">
              <label className="text-slate-400 block font-semibold">Active Signature Schemes</label>
              <label className="flex items-center space-x-2 text-slate-300 cursor-pointer">
                <input
                  type="checkbox"
                  checked={signingScheme.v1}
                  onChange={(e) => setSigningScheme(s => ({ ...s, v1: e.target.checked }))}
                  className="rounded border-slate-700 text-sky-600"
                />
                <span>APK Signature Scheme v1 (JAR Signature / META-INF)</span>
              </label>

              <label className="flex items-center space-x-2 text-slate-300 cursor-pointer">
                <input
                  type="checkbox"
                  checked={signingScheme.v2}
                  onChange={(e) => setSigningScheme(s => ({ ...s, v2: e.target.checked }))}
                  className="rounded border-slate-700 text-sky-600"
                />
                <span>APK Signature Scheme v2 (Full APK ZIP central directory block)</span>
              </label>

              <label className="flex items-center space-x-2 text-slate-300 cursor-pointer">
                <input
                  type="checkbox"
                  checked={signingScheme.v3}
                  onChange={(e) => setSigningScheme(s => ({ ...s, v3: e.target.checked }))}
                  className="rounded border-slate-700 text-sky-600"
                />
                <span>APK Signature Scheme v3 (Key rotation support for Android 9.0+)</span>
              </label>
            </div>
          </div>

          {/* Execution Log */}
          <div className="flex-1 bg-slate-950 border border-slate-800 rounded-lg p-3 font-mono text-[11px] overflow-y-auto space-y-1 text-slate-300">
            {signingLog.length === 0 ? (
              <div className="text-slate-600 italic">
                Click "Sign Target APK" to execute virtual cryptographic signing with testkey.pk8.
              </div>
            ) : (
              signingLog.map((log, i) => (
                <div key={i} className={log.startsWith('SUCCESS') ? 'text-emerald-400 font-bold' : log.includes('Digest') ? 'text-slate-400' : 'text-sky-300'}>
                  {log}
                </div>
              ))
            )}
          </div>
        </div>
      </div>
    </div>
  );
};
