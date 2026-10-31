.class public final Ll/۟ܺۡ;
.super Ljava/lang/Object;
.source "B8WE"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x32

    .line 79
    invoke-static {v0, p1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܺۡ;->֫:Ljava/lang/String;

    const/16 p1, 0x2710

    .line 80
    invoke-static {p1, p2}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܺۡ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۟ܺۡ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ܺۡ;->֫:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۟ܺۡ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ܺۡ;->ۧ:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 84
    iget-object v0, p0, Ll/۟ܺۡ;->֫:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Ll/۟ܺۡ;->ۧ:Ljava/lang/String;

    const/16 v1, 0x32

    invoke-static {v1, v0}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 87
    :cond_0
    iget-object v0, p0, Ll/۟ܺۡ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 96
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x32

    invoke-static {v0, p1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/۟ܺۡ;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/۟ܺۡ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Ll/۟ܺۡ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Ll/۟ܺۡ;->ۧ:Ljava/lang/String;

    return-object v0
.end method
