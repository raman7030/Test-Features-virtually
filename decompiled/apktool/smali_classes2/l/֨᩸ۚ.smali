.class public final Ll/֨᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Ll/᩷᩹ۚ;-><init>()V

    .line 90
    iput-object p1, p0, Ll/֨᩸ۚ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 100
    iget-object v0, p0, Ll/֨᩸ۚ;->֫:Ljava/lang/String;

    const-string v1, "#"

    .line 0
    invoke-static {v1, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 0

    .line 95
    iget-object p1, p0, Ll/֨᩸ۚ;->֫:Ljava/lang/String;

    invoke-virtual {p2}, Ll/᩶֡ۚ;->۟()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
