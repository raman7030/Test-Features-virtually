.class public final synthetic Ll/ᩳۛۡ;
.super Ljava/lang/Object;
.source "J1PQ"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۛۡ;->᩸:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 2
    check-cast p1, Ll/ۧۛۡ;

    .line 4
    check-cast p2, Ll/ۧۛۡ;

    .line 224
    invoke-static {p1}, Ll/ۧۛۡ;->֫(Ll/ۧۛۡ;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ll/ۧۛۡ;->֫(Ll/ۧۛۡ;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Ll/ᩳۛۡ;->᩸:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
