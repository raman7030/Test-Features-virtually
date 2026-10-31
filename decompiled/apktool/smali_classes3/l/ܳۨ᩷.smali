.class public final synthetic Ll/ܳۨ᩷;
.super Ljava/lang/Object;
.source "51FV"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ll/᩵ۨ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/᩵ۨ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۨ᩷;->᩸:Ll/᩵ۨ᩷;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 0
    check-cast p1, Ll/ܿۛۡ;

    check-cast p2, Ll/ܿۛۡ;

    iget-object v0, p0, Ll/ܳۨ᩷;->᩸:Ll/᩵ۨ᩷;

    invoke-static {v0, p1, p2}, Ll/᩵ۨ᩷;->֫(Ll/᩵ۨ᩷;Ll/ܿۛۡ;Ll/ܿۛۡ;)I

    move-result p1

    return p1
.end method
