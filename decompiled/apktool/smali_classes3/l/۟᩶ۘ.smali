.class public final Ll/۟᩶ۘ;
.super Ljava/lang/Object;
.source "H8X1"

# interfaces
.implements Ll/ܰ᩶ۘ;


# instance fields
.field public final ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/۟᩶ۘ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ᩶ۘ;)Ljava/lang/Object;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/۟᩶ۘ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۨ᩶ۘ;Ljava/lang/Object;)V
    .locals 1

    .line 36
    iget-object v0, p0, Ll/۟᩶ۘ;->֫:Ljava/util/HashMap;

    if-nez p2, :cond_0

    .line 37
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 39
    :cond_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ(Ll/ۨ᩶ۘ;)Ljava/lang/Object;
    .locals 2

    .line 2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    iget-object v1, p0, Ll/۟᩶ۘ;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method
