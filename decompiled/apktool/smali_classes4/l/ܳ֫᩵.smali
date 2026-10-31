.class public abstract Ll/ܳ֫᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۚ۟ᩴ;


# instance fields
.field public final a:Ll/ۚ۟ᩴ;

.field public final b:Ll/ۚ۟ᩴ;

.field public final c:J


# direct methods
.method public constructor <init>(Ll/ۚ۟ᩴ;Ll/ۚ۟ᩴ;)V
    .locals 2

    .line 758
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 759
    iput-object p1, p0, Ll/ܳ֫᩵;->a:Ll/ۚ۟ᩴ;

    .line 760
    iput-object p2, p0, Ll/ܳ֫᩵;->b:Ll/ۚ۟ᩴ;

    .line 765
    invoke-interface {p1}, Ll/ۚ۟ᩴ;->count()J

    move-result-wide v0

    invoke-interface {p2}, Ll/ۚ۟ᩴ;->count()J

    move-result-wide p1

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ܳ֫᩵;->c:J

    return-void
.end method


# virtual methods
.method public final a(I)Ll/ۚ۟ᩴ;
    .locals 1

    if-nez p1, :cond_0

    .line 775
    iget-object p1, p0, Ll/ܳ֫᩵;->a:Ll/ۚ۟ᩴ;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 776
    iget-object p1, p0, Ll/ܳ֫᩵;->b:Ll/ۚ۟ᩴ;

    return-object p1

    .line 777
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public bridge synthetic a(I)Ll/᩻۟ᩴ;
    .locals 0

    .line 848
    invoke-virtual {p0, p1}, Ll/ܳ֫᩵;->a(I)Ll/ۚ۟ᩴ;

    move-result-object p1

    check-cast p1, Ll/᩻۟ᩴ;

    return-object p1
.end method

.method public final count()J
    .locals 2

    .line 782
    iget-wide v0, p0, Ll/ܳ֫᩵;->c:J

    return-wide v0
.end method

.method public final o()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
