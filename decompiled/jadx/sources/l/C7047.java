package l;

import android.content.Context;

/* JADX INFO: renamed from: l.ۜ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8CJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7047 extends AbstractC22487 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Object f21713 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C7047 f21714;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final short[] f21715;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7047 m19030(Context context) {
        C7047 c7047;
        synchronized (f21713) {
            if (f21714 == null) {
                f21714 = new C7047(C16218.m38163(context));
            }
            c7047 = f21714;
        }
        return c7047;
    }

    @Override // l.AbstractC22487
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21077 mo19031() {
        return new C23980(this.f21715);
    }

    public C7047(short[] sArr) {
        super(new String[]{"Acoustic Grand", "Bright Acoustic", "Electric Grand", "Honky-Tonk", "Electric Piano 1", "Electric Piano 2", "Harpsichord", "Clav", "Celesta", "Glockenspiel", "Music Box", "Vibraphone", "Marimba", "Xylophone", "Tubular Bells", "Dulcimer", "Drawbar Organ", "Percussive Organ", "Rock Organ", "Church Organ", "Reed Organ", "Accordian", "Harmonica", "Tango Accordian", "Acoustic Guitar(nylon)", "Acoustic Guitar(steel)", "Electric Guitar(jazz)", "Electric Guitar(clean)", "Electric Guitar(muted)", "Overdriven Guitar", "Distortion Guitar", "Guitar Harmonics", "Acoustic Bass", "Electric Bass(finger)", "Electric Bass(pick)", "Fretless Bass", "Slap Bass 1", "Slap Bass 2", "Synth Bass 1", "Synth Bass 2", "Violin", "Viola", "Cello", "Contrabass", "Tremolo Strings", "Pizzicato Strings", "Orchestral Harp", "Timpani", "String Ensembles 1", "String Ensembles 2", "SynthStrings 1", "SynthStrings 2", "Choir Aahs", "Voice Oohs", "Synth Voice", "Orchestra Hit", "Trumpet", "Trombone", "Tuba", "Muted Trumpet", "French Horn", "Brass Section", "SynthBrass 1", "SynthBrass 2", "Soprano Sax", "Alto Sax", "Tenor Sax", "Baritone Sax", "Oboe", "English Horn", "Bassoon", "Clarinet", "Piccolo", "Flute", "Recorder", "Pan Flute", "Blown Bottle", "Skakuhachi", "Whistle", "Ocarina", "Lead 1 (square)", "Lead 2 (sawtooth)", "Lead 3 (calliope)", "Lead 4 (chiff)", "Lead 5 (charang)", "Lead 6 (voice)", "Lead 7 (fifths)", "Lead 8 (bass+lead)", "Pad 1 (new age)", "Pad 2 (warm)", "Pad 3 (polysynth)", "Pad 4 (choir)", "Pad 5 (bowed)", "Pad 6 (metallic)", "Pad 7 (halo)", "Pad 8 (sweep)", "FX 1 (rain)", "FX 2 (soundtrack)", "FX 3 (crystal)", "FX 4 (atmosphere)", "FX 5 (brightness)", "FX 6 (goblins)", "FX 7 (echoes)", "FX 8 (sci-fi)", "Sitar", "Banjo", "Shamisen", "Koto", "Kalimba", "Bagpipe", "Fiddle", "Shanai", "Tinkle Bell", "Agogo", "Steel Drums", "Woodblock", "Taiko Drum", "Melodic Tom", "Synth Drum", "Reverse Cymbal", "Guitar Fret Noise", "Breath Noise", "Seashore", "Bird Tweet", "Telephone Ring", "Helicopter", "Applause", "Gunshot", "Rhythm"});
        this.f21715 = sArr;
    }
}
