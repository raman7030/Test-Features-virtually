.class public Lcom/umeng/commonsdk/config/FieldManager$a;
.super Ljava/lang/Object;
.source "FieldManager.java"


# static fields
.field public static final a:Lcom/umeng/commonsdk/config/FieldManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 28
    new-instance v0, Lcom/umeng/commonsdk/config/FieldManager;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/commonsdk/config/FieldManager;-><init>(Lcom/umeng/commonsdk/config/FieldManager$1;)V

    sput-object v0, Lcom/umeng/commonsdk/config/FieldManager$a;->a:Lcom/umeng/commonsdk/config/FieldManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/umeng/commonsdk/config/FieldManager;
    .locals 1

    .line 27
    sget-object v0, Lcom/umeng/commonsdk/config/FieldManager$a;->a:Lcom/umeng/commonsdk/config/FieldManager;

    return-object v0
.end method
