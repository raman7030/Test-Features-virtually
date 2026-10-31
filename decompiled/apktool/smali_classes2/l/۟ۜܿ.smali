.class public final Ll/۟ۜܿ;
.super Ljava/lang/Object;
.source "B4S2"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public ۧ:I

.field public ܳ:Z

.field public ܽ:Z

.field public final ܿ:Ll/ۙ᩷ܿ;

.field public ᩳ:Ll/᩸᩷ܿ;

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    new-instance v0, Ll/ۙ᩷ܿ;

    invoke-direct {v0}, Ll/ۙ᩷ܿ;-><init>()V

    iput-object v0, p0, Ll/۟ۜܿ;->ܿ:Ll/ۙ᩷ܿ;

    .line 109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۟ۜܿ;->֫:Ljava/util/HashMap;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟ۜܿ;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ۜܿ;->֫:Ljava/util/HashMap;

    return-object p0
.end method

.method public static ֫(Ll/۟ۜܿ;Ljava/lang/String;)V
    .locals 0

    .line 123
    invoke-static {p1}, Ll/ۜ᩷ܿ;->֫(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/۟ۜܿ;->ۧ:I

    const/4 p1, 0x1

    .line 124
    iput-boolean p1, p0, Ll/۟ۜܿ;->ܽ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟ۜܿ;Ll/᩸᩷ܿ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۟ۜܿ;->ᩳ:Ll/᩸᩷ܿ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۟ۜܿ;)Ll/᩸᩷ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ۜܿ;->ᩳ:Ll/᩸᩷ܿ;

    return-object p0
.end method

.method public static ۧ(Ll/۟ۜܿ;Ljava/lang/String;)V
    .locals 0

    .line 117
    invoke-static {p1}, Ll/ۜ᩷ܿ;->֫(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/۟ۜܿ;->᩻:I

    const/4 p1, 0x1

    .line 118
    iput-boolean p1, p0, Ll/۟ۜܿ;->ܳ:Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/۟ۜܿ;)Ll/ۙ᩷ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ۜܿ;->ܿ:Ll/ۙ᩷ܿ;

    return-object p0
.end method

.method public static ᩳ(Ll/۟ۜܿ;)I
    .locals 2

    .line 129
    iget-boolean v0, p0, Ll/۟ۜܿ;->ܳ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/۟ۜܿ;->ܽ:Z

    if-eqz v0, :cond_0

    const v0, 0x1f0f8

    .line 133
    iget v1, p0, Ll/۟ۜܿ;->᩻:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 134
    iget p0, p0, Ll/۟ۜܿ;->ۧ:I

    add-int/2addr v1, p0

    return v1

    .line 130
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Syntax dependencies are not fully loaded"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
