.class public final Ll/᩹ᩴۧ;
.super Ll/ᩳᩴۧ;
.source "78QG"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩺:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 185
    invoke-direct {p0}, Ll/ᩳᩴۧ;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩹ᩴۧ;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ᩴۧ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/᩹ᩴۧ;->᩺:J

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 6

    .line 185
    check-cast p1, Ll/᩹ᩴۧ;

    .line 192
    invoke-virtual {p0}, Ll/ۘ᩸֫;->᩻()Z

    move-result v0

    invoke-virtual {p1}, Ll/ۘ᩸֫;->᩻()Z

    move-result v1

    if-eq v0, v1, :cond_0

    .line 193
    invoke-virtual {p0}, Ll/ۘ᩸֫;->᩻()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    .line 195
    :cond_0
    iget-wide v0, p0, Ll/᩸᩸֫;->ۤ:J

    iget-wide v2, p1, Ll/᩸᩸֫;->ۤ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 197
    iget-wide v0, p0, Ll/᩹ᩴۧ;->᩺:J

    iget-wide v4, p1, Ll/᩹ᩴۧ;->᩺:J

    sub-long/2addr v0, v4

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    cmp-long p1, v0, v2

    if-lez p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, -0x1

    return p1
.end method
