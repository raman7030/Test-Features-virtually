.class public final Ll/᩻ᩳۜ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:Ll/ᩴܽۜ;

.field public final ۧ:Ll/ۜ᩻ܽ;

.field public final ܽ:Ll/᩷᩻ܽ;

.field public ᩳ:Ll/۬ܽۜ;


# direct methods
.method public constructor <init>(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)V
    .locals 0

    .line 1332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1333
    iput-object p1, p0, Ll/᩻ᩳۜ;->֫:Ll/ᩴܽۜ;

    .line 1334
    iput-object p2, p0, Ll/᩻ᩳۜ;->ۧ:Ll/ۜ᩻ܽ;

    .line 1335
    iput-object p3, p0, Ll/᩻ᩳۜ;->ܽ:Ll/᩷᩻ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۬ܽۜ;
    .locals 3

    .line 1342
    iget-object v0, p0, Ll/᩻ᩳۜ;->ᩳ:Ll/۬ܽۜ;

    if-nez v0, :cond_0

    .line 1343
    iget-object v0, p0, Ll/᩻ᩳۜ;->ۧ:Ll/ۜ᩻ܽ;

    iget-object v1, p0, Ll/᩻ᩳۜ;->ܽ:Ll/᩷᩻ܽ;

    iget-object v2, p0, Ll/᩻ᩳۜ;->֫:Ll/ᩴܽۜ;

    invoke-static {v2, v0, v1}, Ll/ۡᩳۜ;->֫(Ll/ᩴܽۜ;Ll/ۜ᩻ܽ;Ll/᩷᩻ܽ;)Ll/᩷᩻ܽ;

    move-result-object v0

    invoke-static {v0}, Ll/ۡᩳۜ;->ۧ(Ll/᩷᩻ܽ;)Ll/۬ܽۜ;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ᩳۜ;->ᩳ:Ll/۬ܽۜ;

    .line 1345
    :cond_0
    iget-object v0, p0, Ll/᩻ᩳۜ;->ᩳ:Ll/۬ܽۜ;

    return-object v0
.end method
