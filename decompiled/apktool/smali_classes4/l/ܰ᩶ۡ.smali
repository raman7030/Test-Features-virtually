.class public final Ll/ܰ᩶ۡ;
.super Ljava/lang/Object;
.source "91US"

# interfaces
.implements Ll/ۡ۬ۡ;


# instance fields
.field public final synthetic ֫:Ll/۟᩶ۡ;


# direct methods
.method public constructor <init>(Ll/۟᩶ۡ;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩶ۡ;->֫:Ll/۟᩶ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 1

    .line 66
    invoke-static {p1}, Ll/۟᩶ۡ;->ܽ(Ll/ۗۗۡ;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 69
    iget-object v0, p0, Ll/ܰ᩶ۡ;->֫:Ll/۟᩶ۡ;

    invoke-static {v0}, Ll/۟᩶ۡ;->֫(Ll/۟᩶ۡ;)Ll/ۨۡᩴ;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    check-cast v0, Ll/ۛۡᩴ;

    invoke-virtual {v0, p1}, Ll/ۛۡᩴ;->add(I)Z

    :cond_0
    return-void
.end method
