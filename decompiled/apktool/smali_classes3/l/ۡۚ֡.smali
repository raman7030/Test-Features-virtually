.class public final Ll/ۡۚ֡;
.super Ll/֡ۚ֡;
.source "R90B"


# instance fields
.field public ۜ:Ljava/lang/String;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ll/֡ۚ֡;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ll/֡ۚ֡;-><init>()V

    .line 20
    iput-object p1, p0, Ll/ۡۚ֡;->᩻:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Ll/ۡۚ֡;->ۜ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤۚ֡;)V
    .locals 0

    .line 26
    invoke-interface {p1, p0}, Ll/ۤۚ֡;->֫(Ll/ۡۚ֡;)V

    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۡۚ֡;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ۡۚ֡;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "destination="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۡۚ֡;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡۚ֡;->ۜ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
