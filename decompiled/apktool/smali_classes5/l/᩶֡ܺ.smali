.class public final Ll/᩶֡ܺ;
.super Ll/֨ۚܺ;
.source "SB7W"


# instance fields
.field public ᩸:Ll/֨ۚܺ;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/֨ۚܺ;)V
    .locals 0

    .line 1345
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1392
    iput-object p1, p0, Ll/᩶֡ܺ;->᩹:Ljava/lang/String;

    .line 1393
    iput-object p2, p0, Ll/᩶֡ܺ;->᩸:Ll/֨ۚܺ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1398
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩶֡ܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩶֡ܺ;->᩸:Ll/֨ۚܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
