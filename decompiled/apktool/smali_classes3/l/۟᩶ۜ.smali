.class public final Ll/۟᩶ۜ;
.super Ljava/lang/Object;
.source "V743"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩶:I

.field public ᩸:Z

.field public final ᩹:Ll/֫ۙۜ;


# direct methods
.method public constructor <init>(Ll/֫ۙۜ;I)V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    iput-object p1, p0, Ll/۟᩶ۜ;->᩹:Ll/֫ۙۜ;

    .line 150
    iput p2, p0, Ll/۟᩶ۜ;->᩶:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟᩶ۜ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۟᩶ۜ;->᩶:I

    return p0
.end method

.method public static ֫(Ll/۟᩶ۜ;I)V
    .locals 1

    .line 154
    iget-boolean v0, p0, Ll/۟᩶ۜ;->᩸:Z

    if-nez v0, :cond_0

    if-ltz p1, :cond_0

    iget v0, p0, Ll/۟᩶ۜ;->᩶:I

    if-gt p1, v0, :cond_0

    sub-int/2addr v0, p1

    .line 157
    iput v0, p0, Ll/۟᩶ۜ;->᩶:I

    .line 158
    iget-object p0, p0, Ll/۟᩶ۜ;->᩹:Ll/֫ۙۜ;

    invoke-static {p0}, Ll/֫ۙۜ;->֫(Ll/֫ۙۜ;)I

    move-result v0

    sub-int/2addr v0, p1

    invoke-static {p0, v0}, Ll/֫ۙۜ;->֫(Ll/֫ۙۜ;I)V

    return-void

    .line 155
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Preview memory reservation is invalid"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ۧ(Ll/۟᩶ۜ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/۟᩶ۜ;->᩶:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 163
    iget-boolean v0, p0, Ll/۟᩶ۜ;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 164
    iput-boolean v0, p0, Ll/۟᩶ۜ;->᩸:Z

    .line 165
    iget-object v0, p0, Ll/۟᩶ۜ;->᩹:Ll/֫ۙۜ;

    invoke-static {v0, p0}, Ll/֫ۙۜ;->֫(Ll/֫ۙۜ;Ll/۟᩶ۜ;)V

    :cond_0
    return-void
.end method
