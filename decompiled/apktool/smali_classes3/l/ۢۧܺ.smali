.class public final Ll/ۢۧܺ;
.super Ljava/lang/Object;
.source "GAW5"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/᩵֫ܺ;


# static fields
.field public static ֫:Ll/ۢۧܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Ll/ۢۧܺ;

    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    sput-object v0, Ll/ۢۧܺ;->֫:Ll/ۢۧܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 50
    invoke-virtual {p1}, Ll/ۨ۟ۡ;->᩻()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 36
    check-cast p2, Ljava/lang/String;

    .line 38
    iget-object p1, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    if-nez p2, :cond_0

    .line 41
    invoke-virtual {p1}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 45
    :cond_0
    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->֫(Ljava/lang/String;)V

    return-void
.end method
