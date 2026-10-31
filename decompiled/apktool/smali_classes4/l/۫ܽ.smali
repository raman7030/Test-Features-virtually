.class public final Ll/۫ܽ;
.super Ljava/lang/Object;
.source "K234"

# interfaces
.implements Ll/ۙۧ;


# instance fields
.field public final ᩸:Ll/֡ܽ;

.field public final synthetic ᩹:Ll/ۨܽ;


# direct methods
.method public constructor <init>(Ll/ۨܽ;Ll/֡ܽ;)V
    .locals 1

    .line 300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "onBackPressedCallback"

    .line 0
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    iput-object p1, p0, Ll/۫ܽ;->᩹:Ll/ۨܽ;

    .line 301
    iput-object p2, p0, Ll/۫ܽ;->᩸:Ll/֡ܽ;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    .line 304
    iget-object v0, p0, Ll/۫ܽ;->᩹:Ll/ۨܽ;

    invoke-static {v0}, Ll/ۨܽ;->ۧ(Ll/ۨܽ;)Ll/ۨ۠᩵;

    move-result-object v1

    iget-object v2, p0, Ll/۫ܽ;->᩸:Ll/֡ܽ;

    invoke-virtual {v1, v2}, Ll/ۨ۠᩵;->remove(Ljava/lang/Object;)Z

    .line 305
    invoke-static {v0}, Ll/ۨܽ;->֫(Ll/ۨܽ;)Ll/֡ܽ;

    move-result-object v1

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 306
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    invoke-static {v0}, Ll/ۨܽ;->ᩳ(Ll/ۨܽ;)V

    .line 309
    :cond_0
    invoke-virtual {v2, p0}, Ll/֡ܽ;->ۧ(Ll/ۙۧ;)V

    .line 310
    invoke-virtual {v2}, Ll/֡ܽ;->֫()Ll/֫᩹᩵;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    :cond_1
    const/4 v0, 0x0

    .line 311
    invoke-virtual {v2, v0}, Ll/֡ܽ;->֫(Ll/֫᩹᩵;)V

    return-void
.end method
