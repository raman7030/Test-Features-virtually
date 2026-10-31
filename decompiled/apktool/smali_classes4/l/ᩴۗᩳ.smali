.class public final Ll/ᩴۗᩳ;
.super Ljava/lang/Object;
.source "56TX"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ll/ۚۙᩳ;

.field public final ᩸:I

.field public volatile ᩹:Ll/֡ۗᩳ;


# direct methods
.method public constructor <init>(Ll/֡ۗᩳ;ILl/ۚۙᩳ;)V
    .locals 0

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    iput-object p1, p0, Ll/ᩴۗᩳ;->᩹:Ll/֡ۗᩳ;

    .line 204
    iput p2, p0, Ll/ᩴۗᩳ;->᩸:I

    .line 205
    iput-object p3, p0, Ll/ᩴۗᩳ;->᩶:Ll/ۚۙᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴۗᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩴۗᩳ;->᩸:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴۗᩳ;)Ll/֡ۗᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۗᩳ;->᩹:Ll/֡ۗᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۗᩳ;->᩶:Ll/ۚۙᩳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴۗᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ᩴۗᩳ;->᩹:Ll/֡ۗᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 222
    iget-object v0, p0, Ll/ᩴۗᩳ;->᩹:Ll/֡ۗᩳ;

    if-eqz v0, :cond_0

    .line 223
    invoke-virtual {v0}, Ll/֡ۗᩳ;->ܽ()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֨ۙᩳ;)Ll/ۚۙᩳ;
    .locals 1

    .line 215
    iget-object v0, p0, Ll/ᩴۗᩳ;->᩹:Ll/֡ۗᩳ;

    if-eqz v0, :cond_0

    .line 217
    invoke-static {v0, p0, p1}, Ll/֡ۗᩳ;->֫(Ll/֡ۗᩳ;Ll/ᩴۗᩳ;Ll/֨ۙᩳ;)Ll/ۚۙᩳ;

    move-result-object p1

    return-object p1

    .line 216
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Text batch is no longer active"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
