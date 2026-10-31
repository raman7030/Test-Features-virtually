.class public final Ll/ۜۗ᩷;
.super Ljava/lang/Object;
.source "Y16E"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic ֫:Ll/᩷ۗ᩷;

.field public final synthetic ۧ:Ll/֡ۚۢ;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩷ۗ᩷;Ll/֡ۚۢ;Ljava/lang/String;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۗ᩷;->֫:Ll/᩷ۗ᩷;

    iput-object p2, p0, Ll/ۜۗ᩷;->ۧ:Ll/֡ۚۢ;

    iput-object p3, p0, Ll/ۜۗ᩷;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    .line 63
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Ll/ۜۗ᩷;->ܽ:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p1

    add-int/lit8 p1, p1, 0x6

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "dp)"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/ۜۗ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {p2, p1}, Ll/֡ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .line 73
    iget-object v0, p0, Ll/ۜۗ᩷;->֫:Ll/᩷ۗ᩷;

    invoke-virtual {v0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-virtual {v0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p1

    add-int/lit8 p1, p1, 0x6

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 74
    invoke-static {v0}, Ll/᩷ۗ᩷;->֫(Ll/᩷ۗ᩷;)V

    return-void
.end method
