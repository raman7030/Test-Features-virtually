.class public final Ll/ۗ۫᩵;
.super Ll/ᩳۗ᩵;
.source "3ANU"


# instance fields
.field public final ᩸:Ll/᩻ۤ᩵;


# direct methods
.method public constructor <init>(Ll/۫۫᩵;Ll/᩻ۤ᩵;)V
    .locals 0

    .line 566
    invoke-direct {p0}, Ll/᩻ۗ᩵;-><init>()V

    .line 824
    iput-object p2, p0, Ll/ۗ۫᩵;->᩸:Ll/᩻ۤ᩵;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 824
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ll/ۗ۫᩵;->֫(Ljava/lang/Throwable;)V

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 829
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RemoveReceiveOnCancel["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗ۫᩵;->᩸:Ll/᩻ۤ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 0

    .line 826
    iget-object p1, p0, Ll/ۗ۫᩵;->᩸:Ll/᩻ۤ᩵;

    .line 245
    invoke-virtual {p1}, Ll/᩷ۛ᩵;->ۖ()Ll/᩷ۛ᩵;

    return-void
.end method
