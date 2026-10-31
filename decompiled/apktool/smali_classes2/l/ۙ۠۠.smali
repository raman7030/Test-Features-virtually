.class public abstract Ll/ۙ۠۠;
.super Ljava/lang/Object;
.source "544J"


# instance fields
.field public ֫:[Ljava/lang/Object;

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ᩳ:Ll/۬۠۠;


# direct methods
.method public constructor <init>(Ll/۬۠۠;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 497
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 498
    iput-object p1, p0, Ll/ۙ۠۠;->ᩳ:Ll/۬۠۠;

    .line 499
    iput-object p2, p0, Ll/ۙ۠۠;->ܽ:Ljava/lang/String;

    .line 500
    iput-object p3, p0, Ll/ۙ۠۠;->ۧ:Ljava/lang/String;

    .line 501
    iput-object p4, p0, Ll/ۙ۠۠;->֫:[Ljava/lang/Object;

    return-void
.end method

.method public static varargs ֫(Ll/۬۠۠;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ll/ۙ۠۠;
    .locals 2

    .line 515
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 517
    new-instance p0, Ll/۫۠۠;

    invoke-direct {p0, p1, p2, p3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p0

    .line 525
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Wrong diagnostic type: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 519
    :cond_1
    new-instance p0, Ll/ۧܶ۠;

    invoke-direct {p0, p1, p2, p3}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p0

    .line 521
    :cond_2
    new-instance p0, Ll/ܰ۠۠;

    invoke-direct {p0, p1, p2, p3}, Ll/ܰ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p0

    .line 523
    :cond_3
    new-instance p0, Ll/ۨ۠۠;

    invoke-direct {p0, p1, p2, p3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 508
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۙ۠۠;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۙ۠۠;->ᩳ:Ll/۬۠۠;

    iget-object v2, v2, Ll/۬۠۠;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙ۠۠;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
