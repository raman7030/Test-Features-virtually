.class public final Ll/ۜ۬֫;
.super Ljava/lang/Object;
.source "N7T6"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ۛ۬ܺ;

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۛ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object v1

    iput-object v1, p0, Ll/ۜ۬֫;->ۧ:Ll/ۛ۬ܺ;

    .line 62
    iput-boolean v0, p0, Ll/ۜ۬֫;->ᩳ:Z

    .line 63
    iput-boolean v0, p0, Ll/ۜ۬֫;->֫:Z

    .line 64
    iput-boolean v0, p0, Ll/ۜ۬֫;->ܽ:Z

    .line 65
    iput-boolean v0, p0, Ll/ۜ۬֫;->ܿ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜ۬֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۜ۬֫;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۜ۬֫;)Ll/ۛ۬ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜ۬֫;->ۧ:Ll/ۛ۬ܺ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۜ۬֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۜ۬֫;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۜ۬֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۜ۬֫;->ܿ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۜ۬֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۜ۬֫;->ᩳ:Z

    return p0
.end method
