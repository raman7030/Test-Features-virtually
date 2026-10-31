.class public final Ll/ۛᩳۧ;
.super Ljava/lang/Object;
.source "18UV"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:Z

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ll/۠ᩴ֫;I)V
    .locals 2

    .line 4264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4265
    iget p1, p1, Ll/۠ᩴ֫;->ᩳ֫:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/ۛᩳۧ;->᩸:Z

    .line 4267
    invoke-static {p2, v1}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۛᩳۧ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 4259
    check-cast p1, Ll/ۛᩳۧ;

    invoke-virtual {p0, p1}, Ll/ۛᩳۧ;->֫(Ll/ۛᩳۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۛᩳۧ;)I
    .locals 3

    .line 4272
    invoke-static {}, Ll/ۜۗܺ;->ܿ()Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/ۛᩳۧ;->᩹:Z

    iget-boolean v2, p1, Ll/ۛᩳۧ;->᩹:Z

    .line 4273
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/ۛᩳۧ;->᩸:Z

    iget-boolean p1, p1, Ll/ۛᩳۧ;->᩸:Z

    .line 4274
    invoke-virtual {v0, v1, p1}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object p1

    .line 4275
    invoke-virtual {p1}, Ll/ۜۗܺ;->֫()I

    move-result p1

    return p1
.end method
