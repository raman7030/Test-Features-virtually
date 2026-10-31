.class public final Ll/᩶ᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public ֫:Z

.field public ۧ:J

.field public ܳ:Z

.field public ܽ:Z

.field public ܿ:J

.field public ᩳ:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1859
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 1860
    iput-wide v0, p0, Ll/᩶ᩴ֫;->ۧ:J

    return-void
.end method

.method public constructor <init>(Ll/ۗᩴ֫;)V
    .locals 2

    .line 1863
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1864
    iget-wide v0, p1, Ll/ۙᩴ֫;->ܿ:J

    iput-wide v0, p0, Ll/᩶ᩴ֫;->ܿ:J

    .line 1865
    iget-wide v0, p1, Ll/ۙᩴ֫;->ۧ:J

    iput-wide v0, p0, Ll/᩶ᩴ֫;->ۧ:J

    .line 1866
    iget-boolean v0, p1, Ll/ۙᩴ֫;->ᩳ:Z

    iput-boolean v0, p0, Ll/᩶ᩴ֫;->ᩳ:Z

    .line 1867
    iget-boolean v0, p1, Ll/ۙᩴ֫;->ܽ:Z

    iput-boolean v0, p0, Ll/᩶ᩴ֫;->ܽ:Z

    .line 1868
    iget-boolean v0, p1, Ll/ۙᩴ֫;->ܳ:Z

    iput-boolean v0, p0, Ll/᩶ᩴ֫;->ܳ:Z

    .line 1869
    iget-boolean p1, p1, Ll/ۙᩴ֫;->֫:Z

    iput-boolean p1, p0, Ll/᩶ᩴ֫;->֫:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶ᩴ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶ᩴ֫;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩶ᩴ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩶ᩴ֫;->ۧ:J

    return-wide v0
.end method

.method public static bridge synthetic ܳ(Ll/᩶ᩴ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶ᩴ֫;->ܳ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/᩶ᩴ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶ᩴ֫;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/᩶ᩴ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩶ᩴ֫;->ܿ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/᩶ᩴ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶ᩴ֫;->ᩳ:Z

    return p0
.end method
