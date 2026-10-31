.class public interface abstract Ll/ۗۗۚ;
.super Ljava/lang/Object;
.source "27CF"


# static fields
.field public static final ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 35
    sput-object v0, Ll/ۗۗۚ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public varargs abstract ֫(JLjava/lang/String;[Ljava/lang/Object;)V
.end method
