.class public Ll/۠ۖۡ;
.super Ll/ۚܺ֫;
.source "5BM7"


# instance fields
.field public ۙ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ll/ۚܺ֫;-><init>()V

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۠ۖۡ;->ۙ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/֨ۖۡ;
    .locals 2

    .line 18
    iget-object v0, p0, Ll/۠ۖۡ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۖۡ;

    if-nez v1, :cond_0

    .line 20
    new-instance v1, Ll/֨ۖۡ;

    invoke-direct {v1, p1}, Ll/֨ۖۡ;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v1, p1, p2}, Ll/֨ۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method
