.class public final synthetic Ll/۟ۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/֨۟ᩳ;

.field public final synthetic ᩸:Ll/ܿۨᩳ;

.field public final synthetic ᩹:Ll/۫ۨᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܿۨᩳ;Ll/۫ۨᩳ;Ll/֨۟ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۛᩳ;->᩸:Ll/ܿۨᩳ;

    iput-object p2, p0, Ll/۟ۛᩳ;->᩹:Ll/۫ۨᩳ;

    iput-object p3, p0, Ll/۟ۛᩳ;->᩶:Ll/֨۟ᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 8690
    new-instance v0, Ll/ᩳۨᩳ;

    iget-object v1, p0, Ll/۟ۛᩳ;->᩸:Ll/ܿۨᩳ;

    iget-object v2, p0, Ll/۟ۛᩳ;->᩶:Ll/֨۟ᩳ;

    invoke-direct {v0, v1, v2}, Ll/ᩳۨᩳ;-><init>(Ll/ܿۨᩳ;Ll/֨۟ᩳ;)V

    iget-object v1, p0, Ll/۟ۛᩳ;->᩹:Ll/۫ۨᩳ;

    invoke-static {v1, v0}, Ll/۫ۨᩳ;->֫(Ll/۫ۨᩳ;Ljava/lang/Runnable;)V

    return-void
.end method
