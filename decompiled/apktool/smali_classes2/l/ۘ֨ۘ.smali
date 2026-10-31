.class public final Ll/ۘ֨ۘ;
.super Ljava/io/IOException;
.source "M89X"


# static fields
.field public static final synthetic ᩶:I


# instance fields
.field public final ᩸:Ll/᩻ۚۘ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 50
    iput p1, p0, Ll/ۘ֨ۘ;->᩹:I

    .line 51
    invoke-static {p1}, Ll/᩻ۚۘ;->֫(I)Ll/᩻ۚۘ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ֨ۘ;->᩸:Ll/᩻ۚۘ;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 4

    .line 55
    iget v0, p0, Ll/ۘ֨ۘ;->᩹:I

    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۘ֨ۘ;->᩸:Ll/᩻ۚۘ;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const-string v0, "Fault: %s (0x%08X)"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
