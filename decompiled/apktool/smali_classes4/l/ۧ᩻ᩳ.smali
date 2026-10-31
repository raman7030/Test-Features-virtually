.class public abstract Ll/ۧ᩻ᩳ;
.super Ljava/lang/Object;
.source "8B3M"

# interfaces
.implements Ll/ܰܳᩳ;


# instance fields
.field public final ᩸:Ll/᩺ۤܿ;

.field public final ᩹:Ll/ۚۛܳ;


# direct methods
.method public constructor <init>(Ll/ۚۛܳ;Ll/᩺ۤܿ;)V
    .locals 0

    .line 409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 410
    iput-object p1, p0, Ll/ۧ᩻ᩳ;->᩹:Ll/ۚۛܳ;

    .line 411
    iput-object p2, p0, Ll/ۧ᩻ᩳ;->᩸:Ll/᩺ۤܿ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 441
    iget-object v0, p0, Ll/ۧ᩻ᩳ;->᩸:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 552
    invoke-virtual {p0}, Ll/ۧ᩻ᩳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۤܺܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 416
    iget-object v0, p0, Ll/ۧ᩻ᩳ;->᩹:Ll/ۚۛܳ;

    invoke-virtual {v0}, Ll/ۚۛܳ;->ܿ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ۜ(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final synthetic ۤ()V
    .locals 0

    return-void
.end method

.method public final ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 1

    .line 426
    iget-object v0, p0, Ll/ۧ᩻ᩳ;->᩹:Ll/ۚۛܳ;

    invoke-virtual {v0, p1}, Ll/ۚۛܳ;->֫(Lnet/sf/sevenzipjbinding/IInArchive;)V

    return-void
.end method

.method public final synthetic ۧ֫()V
    .locals 0

    return-void
.end method

.method public final synthetic ܳ(I)V
    .locals 0

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 431
    iget-object v0, p0, Ll/ۧ᩻ᩳ;->᩸:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۧ()V

    return-void
.end method

.method public final ᩳ֫()Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 1

    .line 421
    iget-object v0, p0, Ll/ۧ᩻ᩳ;->᩹:Ll/ۚۛܳ;

    invoke-virtual {v0}, Ll/ۚۛܳ;->ܳ֫()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 548
    invoke-virtual {p0}, Ll/ۧ᩻ᩳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۤܺܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 436
    iget-object v0, p0, Ll/ۧ᩻ᩳ;->᩸:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final synthetic ᩻֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
