.class public final Ll/ۖۚ֡;
.super Ll/֡ۚ֡;
.source "LAC8"


# instance fields
.field public ۜ:Ljava/lang/String;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ll/֡ۚ֡;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ll/֡ۚ֡;-><init>()V

    .line 34
    iput-object p1, p0, Ll/ۖۚ֡;->᩻:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Ll/ۖۚ֡;->ۜ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤۚ֡;)V
    .locals 0

    .line 40
    invoke-interface {p1, p0}, Ll/ۤۚ֡;->֫(Ll/ۖۚ֡;)V

    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۖۚ֡;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۖۚ֡;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 2

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "destination="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۖۚ֡;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖۚ֡;->ۜ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
