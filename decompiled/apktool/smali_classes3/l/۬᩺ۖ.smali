.class public abstract Ll/۬᩺ۖ;
.super Ljava/lang/Object;
.source "Y9WP"


# instance fields
.field public ֫:Ll/ۗ᩺ۖ;

.field public ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۖ;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩺ۖ;Ljava/lang/Object;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    .line 31
    iput-object p2, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AvPair{avId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    .line 49
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۗ᩺ۖ;
    .locals 1

    .line 39
    iget-object v0, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    return-object v0
.end method

.method public abstract ֫(Ll/۫ܰۖ;)V
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 1

    .line 43
    iget-object v0, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    return-object v0
.end method
