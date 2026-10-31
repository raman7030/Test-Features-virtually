.class public final Ll/ᩴ֫ۧ;
.super Ljava/lang/Object;
.source "U8SG"


# instance fields
.field public ֫:Z

.field public ۜ:J

.field public ۧ:Z

.field public final ܳ:Ll/ۘۧۧ;

.field public ܽ:Z

.field public ܿ:J

.field public ᩳ:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۘۧۧ;)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    iput-object p1, p0, Ll/ᩴ֫ۧ;->ܳ:Ll/ۘۧۧ;

    const/4 p1, 0x1

    .line 70
    iput-boolean p1, p0, Ll/ᩴ֫ۧ;->ᩳ:Z

    const-wide/high16 v0, -0x8000000000000000L

    .line 71
    iput-wide v0, p0, Ll/ᩴ֫ۧ;->ܿ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴ֫ۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩴ֫ۧ;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴ֫ۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩴ֫ۧ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ᩴ֫ۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩴ֫ۧ;->᩻:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴ֫ۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩴ֫ۧ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ᩴ֫ۧ;)Ll/ۘۧۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ֫ۧ;->ܳ:Ll/ۘۧۧ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴ֫ۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩴ֫ۧ;->ܿ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩻(Ll/ᩴ֫ۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩴ֫ۧ;->ۜ:J

    return-wide v0
.end method


# virtual methods
.method public final ֫()Ll/ۚ֫ۧ;
    .locals 1

    const/4 v0, 0x1

    .line 220
    iput-boolean v0, p0, Ll/ᩴ֫ۧ;->ܽ:Z

    .line 221
    new-instance v0, Ll/ۚ֫ۧ;

    invoke-direct {v0, p0}, Ll/ۚ֫ۧ;-><init>(Ll/ᩴ֫ۧ;)V

    return-object v0
.end method

.method public final ֫(J)V
    .locals 1

    .line 138
    iget-boolean v0, p0, Ll/ᩴ֫ۧ;->ܽ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 139
    iput-wide p1, p0, Ll/ᩴ֫ۧ;->ܿ:J

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 177
    iget-boolean v0, p0, Ll/ᩴ֫ۧ;->ܽ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 178
    iput-boolean p1, p0, Ll/ᩴ֫ۧ;->֫:Z

    return-void
.end method

.method public final ۧ(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 99
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 100
    iget-boolean v0, p0, Ll/ᩴ֫ۧ;->ܽ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 101
    iput-wide p1, p0, Ll/ᩴ֫ۧ;->ۜ:J

    return-void
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 213
    iget-boolean v0, p0, Ll/ᩴ֫ۧ;->ܽ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 214
    iput-boolean p1, p0, Ll/ᩴ֫ۧ;->ۧ:Z

    return-void
.end method

.method public final ܽ(Z)V
    .locals 1

    .line 159
    iget-boolean v0, p0, Ll/ᩴ֫ۧ;->ܽ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 160
    iput-boolean p1, p0, Ll/ᩴ֫ۧ;->ᩳ:Z

    return-void
.end method

.method public final ᩳ(Z)V
    .locals 1

    .line 194
    iget-boolean v0, p0, Ll/ᩴ֫ۧ;->ܽ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 195
    iput-boolean p1, p0, Ll/ᩴ֫ۧ;->᩻:Z

    return-void
.end method
