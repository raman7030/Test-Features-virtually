.class public final Ll/᩺ۨۡ;
.super Ljava/lang/Object;
.source "G9SJ"


# instance fields
.field public final ֫:Ll/᩸᩵ᩴ;

.field public final ۧ:Ll/ۤ᩸ᩳ;

.field public ܽ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa1

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ll/᩸᩵ᩴ;

    invoke-direct {v0}, Ll/᩸᩵ᩴ;-><init>()V

    iput-object v0, p0, Ll/᩺ۨۡ;->֫:Ll/᩸᩵ᩴ;

    .line 18
    new-instance v0, Ll/ۤ᩸ᩳ;

    invoke-direct {v0}, Ll/ۤ᩸ᩳ;-><init>()V

    iput-object v0, p0, Ll/᩺ۨۡ;->ۧ:Ll/ۤ᩸ᩳ;

    return-void
.end method


# virtual methods
.method public native ֫()[B
.end method
