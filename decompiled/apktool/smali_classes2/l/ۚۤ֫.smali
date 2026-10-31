.class public final Ll/ۚۤ֫;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source "68UW"


# instance fields
.field public final synthetic ֫:Ll/֨ۤ֫;


# direct methods
.method public constructor <init>(Ll/֨ۤ֫;)V
    .locals 0

    .line 2143
    iput-object p1, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    .line 2146
    iget-object p2, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object p2, p2, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {p2}, Ll/۠ۤ֫;->ۧ(Ll/۠ۤ֫;)Landroid/media/AudioTrack;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2150
    :cond_0
    iget-object p1, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object p1, p1, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {p1}, Ll/۠ۤ֫;->ᩳ(Ll/۠ۤ֫;)Ll/᩸۫֫;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object p1, p1, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {p1}, Ll/۠ۤ֫;->ܿ(Ll/۠ۤ֫;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2153
    iget-object p1, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object p1, p1, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {p1}, Ll/۠ۤ֫;->ᩳ(Ll/۠ۤ֫;)Ll/᩸۫֫;

    move-result-object p1

    invoke-interface {p1}, Ll/᩸۫֫;->ܿ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onPresentationEnded(Landroid/media/AudioTrack;)V
    .locals 1

    .line 2159
    iget-object v0, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object v0, v0, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {v0}, Ll/۠ۤ֫;->ۧ(Ll/۠ۤ֫;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 2163
    :cond_0
    iget-object p1, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object p1, p1, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {p1}, Ll/۠ۤ֫;->ܳ(Ll/۠ۤ֫;)V

    return-void
.end method

.method public final onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    .line 2168
    iget-object v0, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object v0, v0, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {v0}, Ll/۠ۤ֫;->ۧ(Ll/۠ۤ֫;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2172
    :cond_0
    iget-object p1, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object p1, p1, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {p1}, Ll/۠ۤ֫;->ᩳ(Ll/۠ۤ֫;)Ll/᩸۫֫;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object p1, p1, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {p1}, Ll/۠ۤ֫;->ܿ(Ll/۠ۤ֫;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2177
    iget-object p1, p0, Ll/ۚۤ֫;->֫:Ll/֨ۤ֫;

    iget-object p1, p1, Ll/֨ۤ֫;->ܽ:Ll/۠ۤ֫;

    invoke-static {p1}, Ll/۠ۤ֫;->ᩳ(Ll/۠ۤ֫;)Ll/᩸۫֫;

    move-result-object p1

    invoke-interface {p1}, Ll/᩸۫֫;->ܿ()V

    :cond_1
    :goto_0
    return-void
.end method
