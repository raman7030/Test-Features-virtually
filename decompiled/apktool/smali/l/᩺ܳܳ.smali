.class public Ll/᩺ܳܳ;
.super Ljava/lang/Object;
.source "BAUQ"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ljava/util/Iterator;

.field public final synthetic ᩸:Lbin/mt/json/JSONObject;

.field public final synthetic ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;Ljava/util/Iterator;Ljava/util/Iterator;)V
    .locals 0

    .line 805
    iput-object p1, p0, Ll/᩺ܳܳ;->᩸:Lbin/mt/json/JSONObject;

    iput-object p2, p0, Ll/᩺ܳܳ;->᩹:Ljava/util/Iterator;

    iput-object p3, p0, Ll/᩺ܳܳ;->᩶:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 808
    iget-object v0, p0, Ll/᩺ܳܳ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Lbin/mt/json/JSONObject$Member;
    .locals 3

    .line 812
    iget-object v0, p0, Ll/᩺ܳܳ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 813
    iget-object v1, p0, Ll/᩺ܳܳ;->᩶:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    .line 814
    new-instance v2, Lbin/mt/json/JSONObject$Member;

    invoke-direct {v2, v0, v1}, Lbin/mt/json/JSONObject$Member;-><init>(Ljava/lang/String;Lbin/mt/json/JSONValue;)V

    return-object v2
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 805
    invoke-virtual {p0}, Ll/᩺ܳܳ;->next()Lbin/mt/json/JSONObject$Member;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 818
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
