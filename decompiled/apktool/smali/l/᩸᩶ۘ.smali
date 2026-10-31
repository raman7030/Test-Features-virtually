.class public final Ll/᩸᩶ۘ;
.super Ljava/lang/Object;
.source "G8ZP"

# interfaces
.implements Ll/۠᩶ۘ;


# instance fields
.field public final ֫:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/᩸᩶ۘ;->֫:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/֫ۙۘ;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/᩸᩶ۘ;->֫:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۙۘ;

    return-object p1
.end method
