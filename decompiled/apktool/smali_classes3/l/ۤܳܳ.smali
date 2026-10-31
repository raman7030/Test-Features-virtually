.class public Ll/ۤܳܳ;
.super Ljava/lang/Object;
.source "LAUN"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩸:Lbin/mt/json/JSONArray;

.field public final synthetic ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONArray;Ljava/util/Iterator;)V
    .locals 0

    .line 523
    iput-object p1, p0, Ll/ۤܳܳ;->᩸:Lbin/mt/json/JSONArray;

    iput-object p2, p0, Ll/ۤܳܳ;->᩹:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 526
    iget-object v0, p0, Ll/ۤܳܳ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Lbin/mt/json/JSONValue;
    .locals 1

    .line 530
    iget-object v0, p0, Ll/ۤܳܳ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbin/mt/json/JSONValue;

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 523
    invoke-virtual {p0}, Ll/ۤܳܳ;->next()Lbin/mt/json/JSONValue;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 534
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
