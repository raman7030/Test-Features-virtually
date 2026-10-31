.class public final Ll/ۜۖۖ;
.super Ljava/lang/Exception;
.source "99PI"


# static fields
.field public static final serialVersionUID:J = 0x4fccd5afd98283ccL


# instance fields
.field public final ᩸:Ll/᩻֡ۖ;


# direct methods
.method public constructor <init>(Ll/֨ۖۖ;Ljava/lang/String;)V
    .locals 2

    .line 2886
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/֨ۖۖ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2891
    invoke-virtual {p1}, Ll/֨ۖۖ;->ܿ()Ljava/lang/String;

    .line 2892
    invoke-virtual {p1}, Ll/֨ۖۖ;->ۢ()Ll/᩻֡ۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜۖۖ;->᩸:Ll/᩻֡ۖ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/֨ۖۖ;Ljava/lang/String;I)V
    .locals 0

    .line 2862
    invoke-direct {p0, p1, p2}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۖۖ;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 2900
    invoke-direct {p0, p1, p2}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;)V

    .line 2901
    invoke-virtual {p0, p3}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-void
.end method

.method public constructor <init>(Ll/ۚۖۖ;Ljava/lang/String;)V
    .locals 2

    .line 2906
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۚۖۖ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2911
    invoke-virtual {p1}, Ll/ۚۖۖ;->getName()Ljava/lang/String;

    return-void
.end method
