.class public abstract Ll/֫᩻ᩳ;
.super Ljava/lang/Object;
.source "8B3M"

# interfaces
.implements Ll/ܰܳᩳ;


# instance fields
.field public final ᩸:Ll/ۖۛܳ;


# direct methods
.method public constructor <init>(Ll/ۖۛܳ;)V
    .locals 0

    .line 472
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 473
    iput-object p1, p0, Ll/֫᩻ᩳ;->᩸:Ll/ۖۛܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 552
    invoke-virtual {p0}, Ll/֫᩻ᩳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۤܺܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 479
    iget-object v0, p0, Ll/֫᩻ᩳ;->᩸:Ll/ۖۛܳ;

    invoke-virtual {v0}, Ll/ۖۛܳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ۜ(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public synthetic ۤ()V
    .locals 0

    return-void
.end method

.method public final ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 1

    .line 489
    iget-object v0, p0, Ll/֫᩻ᩳ;->᩸:Ll/ۖۛܳ;

    invoke-virtual {v0, p1}, Ll/ۖۛܳ;->ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V

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

.method public final ᩳ֫()Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 1

    .line 484
    iget-object v0, p0, Ll/֫᩻ᩳ;->᩸:Ll/ۖۛܳ;

    invoke-virtual {v0}, Ll/ۖۛܳ;->᩹()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 548
    invoke-virtual {p0}, Ll/֫᩻ᩳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۤܺܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic ᩻֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
