.class public Lcom/umeng/commonsdk/utils/b$a;
.super Ljava/lang/Object;
.source "TAJ0"


# static fields
.field public static final a:Lcom/umeng/commonsdk/utils/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 21
    new-instance v0, Lcom/umeng/commonsdk/utils/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/commonsdk/utils/b;-><init>(Lcom/umeng/commonsdk/utils/b$1;)V

    sput-object v0, Lcom/umeng/commonsdk/utils/b$a;->a:Lcom/umeng/commonsdk/utils/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/umeng/commonsdk/utils/b;
    .locals 1

    .line 20
    sget-object v0, Lcom/umeng/commonsdk/utils/b$a;->a:Lcom/umeng/commonsdk/utils/b;

    return-object v0
.end method
