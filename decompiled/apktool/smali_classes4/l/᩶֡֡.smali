.class public final Ll/᩶֡֡;
.super Ljava/lang/Object;
.source "B6LV"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/֡ۚ֡;

.field public final ܽ:Ll/᩷֨֡;

.field public final ᩳ:Ll/᩹֡֡;


# direct methods
.method public constructor <init>(Ll/᩹֡֡;Ll/֡ۚ֡;Ll/᩷֨֡;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Ll/᩶֡֡;->֫:Z

    .line 26
    iput-object p1, p0, Ll/᩶֡֡;->ᩳ:Ll/᩹֡֡;

    .line 27
    iput-object p2, p0, Ll/᩶֡֡;->ۧ:Ll/֡ۚ֡;

    .line 28
    iput-object p3, p0, Ll/᩶֡֡;->ܽ:Ll/᩷֨֡;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֡ۚ֡;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/᩶֡֡;->ۧ:Ll/֡ۚ֡;

    return-object v0
.end method

.method public final ۧ()Ll/᩷֨֡;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/᩶֡֡;->ܽ:Ll/᩷֨֡;

    return-object v0
.end method

.method public final ܽ()Ll/᩹֡֡;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/᩶֡֡;->ᩳ:Ll/᩹֡֡;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 44
    iget-boolean v0, p0, Ll/᩶֡֡;->֫:Z

    return v0
.end method

.method public final ᩳ()Ll/᩶֡֡;
    .locals 1

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Ll/᩶֡֡;->֫:Z

    return-object p0
.end method
