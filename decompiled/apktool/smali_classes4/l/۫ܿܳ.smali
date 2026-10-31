.class public final synthetic Ll/۫ܿܳ;
.super Ljava/lang/Object;
.source "A6LD"

# interfaces
.implements Ll/۠֨֡;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/util/HashMap;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܿܳ;->֫:Ljava/lang/String;

    iput-object p2, p0, Ll/۫ܿܳ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/۫ܿܳ;->ܽ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final create()Ll/ۛܿܳ;
    .locals 4

    .line 153
    new-instance v0, Ll/ۛܿܳ;

    iget-object v1, p0, Ll/۫ܿܳ;->֫:Ljava/lang/String;

    iget-object v2, p0, Ll/۫ܿܳ;->ۧ:Ljava/lang/String;

    iget-object v3, p0, Ll/۫ܿܳ;->ܽ:Ljava/util/HashMap;

    invoke-direct {v0, v1, v2, v3}, Ll/ۛܿܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    return-object v0
.end method
