.class public final Ll/ܽۙ᩵;
.super Ljava/lang/Object;
.source "NAWS"

# interfaces
.implements Ll/ܳۙ᩵;


# instance fields
.field public final ֫:Ll/ᩴۙ᩵;

.field public final ۧ:Ll/ۚۙ᩵;


# direct methods
.method public constructor <init>(Ll/ۚۙ᩵;Ll/ᩴۙ᩵;)V
    .locals 0

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    iput-object p1, p0, Ll/ܽۙ᩵;->ۧ:Ll/ۚۙ᩵;

    .line 193
    iput-object p2, p0, Ll/ܽۙ᩵;->֫:Ll/ᩴۙ᩵;

    return-void
.end method

.method public static final synthetic ֫(Ll/ܽۙ᩵;)Ll/ܺ᩹᩵;
    .locals 0

    .line 190
    iget-object p0, p0, Ll/ܽۙ᩵;->֫:Ll/ᩴۙ᩵;

    return-object p0
.end method

.method public static final synthetic ۧ(Ll/ܽۙ᩵;)Ll/ܳۙ᩵;
    .locals 0

    .line 190
    iget-object p0, p0, Ll/ܽۙ᩵;->ۧ:Ll/ۚۙ᩵;

    return-object p0
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 196
    new-instance v0, Ll/ۧۙ᩵;

    invoke-direct {v0, p0}, Ll/ۧۙ᩵;-><init>(Ll/ܽۙ᩵;)V

    return-object v0
.end method
